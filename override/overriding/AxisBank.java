package override.overriding;

//Child class
public class AxisBank extends BankInfo {
	
	// Override a method from parent class
	public void deposit() {
		int amount = 50000;
		System.out.println("The deposit amount is:" + amount);

	}

	public static void main(String[] args) {

		// Create an object for child class and access the parent class method
		AxisBank ax = new AxisBank();
		ax.savingAccount();
		ax.fixed();
		ax.deposit();
	}

}
