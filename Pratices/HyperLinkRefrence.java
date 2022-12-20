package Pratices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkRefrence {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click the button to go to dashboard
		System.out.println("1. Go To Dashboard");
		WebElement go = driver.findElement(By.linkText("Go to Dashboard"));
		go.click();
		driver.navigate().back();

//without click the link find my destination
		Thread.sleep(2000);
		System.out.println(" 2.Find my destination");
		WebElement findurl = driver.findElement(By.partialLinkText("clicking me."));
		String attribute = findurl.getAttribute("href");
		System.out.println("Find my destination" + attribute);

//checking it this broken link
		Thread.sleep(3000);

		System.out.println("3.Am I broken link?");

		WebElement link = driver.findElement(By.linkText("Broken?"));
		link.click();

		String title = driver.getTitle();
		title.contains("404");
		{
			System.out.println("link broken");
		}

		driver.navigate().back();

//Duplicate Link
		System.out.println("4.Duplicate Link");
//if we give same go.click it give me stale element exception
		WebElement go1 = driver.findElement(By.linkText("Go to Dashboard"));
		go1.click();
		driver.navigate().back();

//Count Links
		System.out.println("5.Count Links");
		List<WebElement> totalclick = driver.findElements(By.tagName("a"));
		int link1 = totalclick.size();
		System.out.println("count link " + ":" + link1);

//How many links in this layout?
		System.out.println(" 6.How many links in this layout?");

		driver.findElement(By.linkText("How many links in this layout?")).click();

		List<WebElement> total = driver.findElements(By.tagName("a"));
		int link2 = total.size();
		System.out.println("How many links in this layout :" + "" + link2);

		driver.navigate().back();

	}

}
