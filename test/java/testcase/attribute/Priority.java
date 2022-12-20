package testcase.attribute;

import org.testng.annotations.Test;

public class Priority {
    //The priority for this test method. Lower priorities will be scheduled first.
    //The default value of priority is 0
	//The order of excution is -1,-2,-3,1,2,3
	//Runs second
	@Test(priority=1)
	public void test1() {
		System.out.println("Test1 is excuted");
	
	}
	//Runs second
	@Test(priority=-2)
	public void test2() {
		System.out.println("Test2 is excuted");
	
	}
	//Runs third
	@Test(priority=3)
	public void test3() {
		System.out.println("Test3 is excuted");
	
	}
	
}
