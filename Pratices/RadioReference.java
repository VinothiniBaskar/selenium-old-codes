package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioReference {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("https://leafground.com/radio.xhtml");
		//Maxi the Browser
		driver.manage().window().maximize();
		
		//Your most favorite browser
		System.out.println("1.Your most favorite browser");
		WebElement browser = driver.findElement(By.xpath("//label[text()='Firefox']"));
		browser.click();
		System.out.println("i choose my favorite browser" + " "+ browser.getText());
		
		//UnSelectable
		
		System.out.println("2.UnSelectable");
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		Thread.sleep(3000);
		WebElement unselect = driver.findElement(By.xpath("//label[text()='Chennai']"));
		unselect.click();
		boolean selected2 = unselect.isSelected();
		if(selected2) {
			System.out.println("radio button is selected");
		}else {
			System.out.println("radio button is unselected");
		}
		
		//Find the default select radio button
		System.out.println("3.Find the default select radio button");
		WebElement select = driver.findElement(By.xpath("//label[text()='Safari']"));
		boolean selected = select.isEnabled();
		if(selected) {
			System.out.println("we find the defaultselect radio button"+ "  "  +select.getText());
		}else {
			System.out.println("we  not find the defaultselect radio button");
		}
		Thread.sleep(4000);
		//Select the age group (only if not selected)
		System.out.println("4.Select the age group (only if not selected)");
		
		WebElement sele1 = driver.findElement(By.xpath("//label[text()='1-20 Years']"));
		sele1.click();
		System.out.println("clicked");
		Thread.sleep(3000);
		
		WebElement sele3 = driver.findElement(By.xpath("//label[text()='41-60 Years']"));
		sele3.click();
		System.out.println("clicked");
		
		
	}


	}


