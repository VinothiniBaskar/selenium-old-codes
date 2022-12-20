package inherit.singleinheritance;

public class Computer {

	// Variable declaration
	String model = "WDC WD2500LPCX-24C6HT0 ATA Device";
	String size="2GB";
	static int a=10;
	
	public void staticMethod()
	{
		System.out.println(a);
	}	

	// Create a method
	public void computerModel() {
		System.out.println("The model of the computer is :" + model);

	}
	
	protected void computerRamSize() {
		System.out.println("The size of the RAM is :" +size );

		
	}

}
