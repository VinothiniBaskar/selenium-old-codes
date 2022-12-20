package staticparameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassBasic {
	//Declare a ChomerDriver globally for both the test cases runs
	public ChromeDriver driver;

	//Pass the parameter(testng.xml) in the Parameters attribute
	//The name must  be same
	//Suppose need to change the username and password -->go to the testng.xml file and change the parameter value
	@Parameters({"url","username","password"})
	//This @BeforeMethod excutes 2 times one is for CreateLead and next time for Edit Lead
	@BeforeMethod
	//Use that parameters inside the methods using arguments
	//order should be same -->sequence order
	//Name doesn't matter
	public void preCondition(String url,String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Replace all the hard coded values in the elements
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	//This @@AfterMethod excutes 2 times one is for CreateLead and next time for Edit Lead

	@AfterMethod

	public void postCondition() {
		 driver.close();
	}

	

}
