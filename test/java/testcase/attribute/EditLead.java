package testcase.attribute;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClassBasic {

	// It donetes it is test case to run
	// The list of methods this method depends on
	// It accepts array of string values link single string(method namme") or array
	// of string ("multiple methods name)
	// The syntax of dependsOnMethods is(package_name.Class_Name.Method_Name)
	// @Test(dependsOnMethods="testcase.attribute.CreateLead.createLead")
//	@Test(dependsOnMethods = "testcase.attribute.CreateLead.createLead")

	// If set to true ,this testmethod will always be run even if dependson method
	// should be failed
	// example--->CreateLead (dependsonMethod)should be fail and by using (
	// alwaysRun=true ) attribute
	// we can run the EditLead testcase
	 @Test(dependsOnMethods="testcase.attribute.CreateLead.createLead",alwaysRun=true)

	 //When new builders are enter into the project with similar testcases we have
	//to run other all the testcases except the new builder testcase
	//In this situvation we can use enabled=false
	//Past testcases-->to be run
	//future testcases--->not run
	//The status will be present in the ignored methods(Report)
//	 @Test(enabled=false)
	 
	public void editLead() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("86");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.name("submitButton")).click();                           

	}
}
