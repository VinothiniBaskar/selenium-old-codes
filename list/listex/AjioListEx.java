package list.listex;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Sarees",Keys.ENTER);
		
		 List<WebElement> sareeEmelents=driver.findElements(By.xpath("//div[@class='brand']"));
		 List<String> list=new ArrayList<String>();
		 
		 
		 
		 for (int i = 0; i < sareeEmelents.size(); i++) {
//	        	System.out.println(list.get(i).getText());
	        	String itemsName=sareeEmelents.get(i).getText().replaceAll(",", "");
	        	list.add(itemsName);
				
			}
	        System.out.println(list);
	        

	}

}
