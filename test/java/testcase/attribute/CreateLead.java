package testcase.attribute;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//extends the baseclass in child class(CreateLead)
public class CreateLead extends BaseClassBasic {

	// It donetes it is test case to run
	// The number of times this method should be invoked.
	// count will be need to give,If invoactionCount is 2 that testcase sholud be
	// executed 2 times
	// The maximum number of milliseconds this test should take for the cumulated
	// time of all the invocationcounts
	// This attribute will be ignored if invocationCount is not specified. --> it is
	// only applicable for invocationCount attribute
	// The invocation timeout is set to some secs that test case should be excuted
	// with spefied (total sum of 2 testcases)time ,it returns the result pass
	// otherwise fail -->Ex --test1 and test 2 runs(sum) 18.023s but actual
	// invocationTimeOut is 17000
//	@Test(invocationCount=2,invocationTimeOut=17000)

	// timeOut is used to set the maximam number of milliseconds this test should
	// take
	// It is for each iteration -->Ex --testcase1 is 7.02s and testcase2 is 8.02s
	// but the timeOut is 8000
	// testcase1 -->Pass and testcase2 --->Failed
	// @Test(invocationCount=2,timeOut=10000)

	// The list of groups this method depends on
	// We want to run the particular group of testcase by using groups
	// For example vino wrote 30 and divya wrote 10,we want to run vino test cases
	// in the @Test(groups="group_Name")
	// And alsp give the group name in pre condion and post condition in the before
	// method and after method
	// Go the testng.xml file and add the group tag,run tag,include tag inside the
	// suite tag.
	// <include name="vino"></include>
	//We can use  <exclude name="vino"></exclude> -->It means except this groups run all the testcases
    //@Test(groups="vino")
   
	@Test
	public void createLead() {

		// When we are using wrong id or something occurs in CreateLead class,that
		// createlead testcase should be failed
		// EditLead testcase should ne skipped ,because using the dependsOnMethods
//		driver.findElement(By.linkText("Lead")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vinothini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("86");
		driver.findElement(By.name("submitButton")).click();

	}

}
