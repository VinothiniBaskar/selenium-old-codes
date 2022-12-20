package Pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//select the option by  using selectByIndex
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select s=new Select(dropDown1);
		s.selectByIndex(2);
		
		//select the option by  using selectByValue
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select s1=new Select(dropDown2);
		s1.selectByValue("3");
		
		//select the option by  using selectByVisibleText
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select s2=new Select(dropDown3);
		s2.selectByVisibleText("Selenium");
		
		//Get the number of elements in the dropdown
		  List<WebElement> listOfOptions=s.getOptions();
		  int number=listOfOptions.size();
		  System.out.println("The number of elements is :"+number);
		  
		  
		 //select the option by using send keys method -->This is interview question 
		  dropDown1.sendKeys("Appium");
		  
		  
		  //select the multiple options 
		  WebElement dropDown4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		  Select s3=new Select(dropDown4);
		  s3.selectByIndex(1);
		  s3.selectByIndex(2);
		  s3.selectByIndex(4);

		
		 
		
		
		
	}

}
