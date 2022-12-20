package override.overriding;

//Parent class
public class BankInfo {

	// Create a method
	public void savingAccount() {
		System.out.println("This is a Savings account");
	}

	// Create a method
	public void fixed() {
		System.out.println("This is a fixed account");

	}

	// Create a method
	public void deposit() {
		int amount = 10000;
		System.out.println("The deposit amount is:" + amount);

	}

}
