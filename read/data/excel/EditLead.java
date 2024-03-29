package read.data.excel;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.dataprovider.BaseClass;

public class EditLead extends BaseClass {
	@DataProvider(name="edit")
	public String[][] fetchDataForEdit() {
		String[][] data=new String[1][2];
		
		data[0][0]="98";
		data[0][1]="TestLeaf";
		
		
		
		return data;

	}
	@Test(dataProvider="edit")
	public void editLead(String phoneNumber,String companyName) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();

	}
}
