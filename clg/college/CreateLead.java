package clg.college;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testcase.dataprovider.BaseClass;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setUp() {
		ExcelFileName="CreateLead";
	}

	@Test(dataProvider="fetch")
	public void createLead(String companyName,String firstName,String lastName,String phoneNumber) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();

	}

}
 
