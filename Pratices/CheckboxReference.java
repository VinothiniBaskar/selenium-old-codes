package Pratices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxReference {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	     //verify the status message
		String text = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
        System.out.println("Notification status:"+text);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
        boolean selected = driver.findElement(By.xpath("//span[text()='Ajax']")).isSelected();
		Thread.sleep(2000);
        String text1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
        System.out.println("Notification status for uncheck:"+text1);
        System.out.println(selected);
          //Choose your favorite language(s)
         driver.findElement(By.xpath("//label[text()='Python']")).click();
         driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[3]")).click();
         //Tri State Checkbox
         int count=1;
 		while(count<=3) {
         driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
         
         //driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
         Thread.sleep(2000);
         String triState1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
         System.out.println("TriState "+triState1);
         count++;
 		}
        //Toggle Switch
         driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
         Thread.sleep(1000);
         String toggleSwitch = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
         System.out.println("Toggle"+toggleSwitch);
         if(toggleSwitch.contains("Checked")) {
 			System.out.println("Toggle switch checked");
 		}else {
 			System.out.println("Toggle switch checked");
 		}
         //Verify if check box is disabled
         boolean checkboxDisabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectboolean')])[3]")).isSelected();
	     System.out.println("check box is disabled:"+checkboxDisabled);
	     if(checkboxDisabled==false) {
				System.out.println("The checkbox is disabled");
			}else {
				System.out.println("The checkbox is enabled");
			}
	     //Select Multiple
	     driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
	     
	    driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox ui-widget')]/div[contains(@class,'ui-chkbox-box ui-widget')])[10]")).click();
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[contains(@class,'ui-selectcheckboxmenu')]")).click();
	     //print the check box options
	     List<WebElement> multiSelect = driver.findElements(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu')]/li"));
	     for (int j =0; j <multiSelect.size() ; j++) {
		  String text2 = multiSelect.get(j).getText();
		  System.out.println(text2);	 
		 	
		}
		  
	}

}
