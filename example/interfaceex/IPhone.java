package example.interfaceex;

public class IPhone implements Mobile {

	public void sendSms() {
		System.out.println("The sms is received");
	}

	public void dialNumnber() {
		System.out.println("The number is Dialed");

	}

	public void switchOn() {
		System.out.println("Switch on the mobile");

	}

	public static void main(String[] args) {
		
		// create an object for concrete class
		IPhone ip = new IPhone();
		ip.sendSms();
		ip.dialNumnber();
		ip.switchOn();

	}

}
