package steps;


import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep  extends BaseClass{

	@Given("Enter the username as Democsr2")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Democsr2");

	}
	//For Positive
	@Given("Enter the password as crmsfa")
	//For Negative
//	@Given("Enter the password as crmsfa1")
	public void enterPassword() {
		//For Positive
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		//For Negative
//		driver.findElement(By.id("password")).sendKeys("crmsfa1");
	   
	}

	@When("Click on  Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomPage should be displayed")
	public void verifyHomePage() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		String text = driver.getTitle();

		if (text.contains("My Home")) {
			System.out.println("Home Page is displyed");

		} else {
			System.out.println("Home Page is  not displyed");

		}
	}

	@But("ErrorMessage should be displayed")
	public void errorMessage() {
		String text1 = driver.findElement(By.xpath("//div[@id='errorDiv']//p")).getText();
		if (text1.contains("The Following Errors ")) {
			System.out.println("Error messgae is displayed");

		} else {
			System.out.println("Error messgae is not  displayed");

		}

	}



}
