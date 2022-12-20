package steps;


import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadBasicStep extends BaseClass {


	@And("Click Leads Button")
	public void clickLeads() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click CreateLead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyName as TestLeaf")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	@And("Enter the firstName as Vino")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
	}
	@And("Enter the LastName as B")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
	}
	@When("Click on the CreateLeads Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View Lead page is displayed")
	public void viewLeadPage() {
		boolean viewPage=driver.findElement(By.name("submitButton")).isDisplayed();
		if (viewPage) {
			System.out.println("View Lead is displayed");
		}
		else {
			System.out.println("View Lead is  not displayed");

		}
	}

}

