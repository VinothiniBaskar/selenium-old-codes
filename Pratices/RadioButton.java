package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch URL "https://leafground.com/radio.xhtml"
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		// Give the implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	WebElement checked=	driver.findElement(By.xpath("//label[text()='Chrome']"));
	checked.click();
	boolean status=checked.isEnabled();
	System.out.println(status);
		
	}
  
}
