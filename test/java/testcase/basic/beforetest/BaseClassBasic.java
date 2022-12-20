package testcase.basic.beforetest;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClassBasic {
	public ChromeDriver driver;

//It runs 2 times --> one for CreateLead and one for Edit Lead	
@BeforeMethod
public void preCondition() {
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

}



//It runs 2 times --> one for CreateLead and one for Edit Lead	
	@AfterMethod

	public void postCondition() {
		 driver.close();
	}

	

}
