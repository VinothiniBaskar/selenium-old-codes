package inherit.singleinheritance;

public class Desktop extends Computer {

	// Variable declaration
	int size = 28;

	// Create a method
	public void getSize() {
		System.out.println("The size of the Desktop is :" + size);
	}

	public static void main(String[] args) {

		// Create an object for child class and access the parent class method
		Desktop d = new Desktop();
		d.computerModel();
		d.getSize();
		d.computerRamSize();
		d.staticMethod();
	}

}
 