package list.listex;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
		
		
		
	        List<WebElement> phoneEmelents=	driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	        List<Integer> list=new ArrayList<Integer>();
	        
	        for (int i = 0; i < phoneEmelents.size(); i++) {
//	        	System.out.println(list.get(i).getText());
	        	String price=phoneEmelents.get(i).getText().replaceAll(",", "");
	        	int convertedString=Integer.parseInt(price);
	        	list.add(convertedString);
				
			}
	        System.out.println(list);
	        
	        //Sort the list
	        Collections.sort(list);
	        
	        //Get the mobile  price of the  lowest price
	        System.out.println(list.get(0));
	        
	       
	        
	       

	}

}
