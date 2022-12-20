package Inheritance;
//child class
public class Bike extends Vehicle  {
	
	//overridden method
	public void soundHorn() {
		System.out.println("Bike horn is pressed");
	}

	
	public void startBike() {
		//call the parent method by using super keyword
		super.soundHorn();
		System.out.println("start the bike");
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.startBike();
	}
}
