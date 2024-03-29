package testcase.attribute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassBasic {
	// Declare a ChomerDriver globally for both the test cases runs
	public ChromeDriver driver;

	// This @BeforeMethod excutes 2 times one is for CreateLead and next time for
	// Edit Lead
	// And alsp give the group name in pre condion and post condition in the before
	// method and after method
	// @BeforeMethod(groups="vino")

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	// This @@AfterMethod excutes 2 times one is for CreateLead and next time for
	// Edit Lead
	// And alsp give the group name in pre condion and post condition in the before
	// method and after method
//	@AfterMethod(groups="vino")

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
