package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();

		// verify the checkbox is checked or unchecked
		WebElement check = driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]"));
		check.click();
		boolean value = check.isSelected();
		System.out.println("The Given checkbox is:" + value);

		// verify the checkbox is checked or unchecked
		WebElement check1 = driver
				.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input"));
		boolean value1 = check1.isSelected();
		System.out.println("The Given checkbox is:" + value1);

		// Select and unselect the check box
		WebElement firstElement = driver
				.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[1]"));

		if (firstElement.isSelected()) {
			firstElement.click();
		} else {
			System.out.println("The element is already selected");
		}

		WebElement secondElement = driver
				.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]"));
		if (secondElement.isSelected()) {
			secondElement.click();
		} else {
			System.out.println("The element is not selected");
		}

		// Multiple select checkbox
		WebElement check2 = driver
				.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[1]"));
		check2.click();
		WebElement check3 = driver
				.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[2]"));
		check3.click();
		WebElement check4 = driver
				.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[3]"));
		check4.click();

	}

}