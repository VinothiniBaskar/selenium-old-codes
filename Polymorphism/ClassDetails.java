package Polymorphism;

public class ClassDetails {

	public void employeeDetails() {
		System.out.println("The Employee of Details are  :");
		
		

	}

	public void employeeDetails(int age) {
		System.out.println("The Employee of age is :" + age);

	}

	public void employeeDetails(String name) {
		System.out.println("The Employee of name is :" + name);

	}

	public static void main(String[] args) {
		ClassDetails employee = new ClassDetails();
		employee.employeeDetails();
		employee.employeeDetails(24);
		employee.employeeDetails("Vinothini Baskaran");

	}

}
