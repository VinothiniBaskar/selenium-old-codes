package assignment;

public class LearnConstructor {

	int empId;
	String empName;
	boolean status;

	LearnConstructor() {
		System.out.println("I am from Default Constructor");
	}

	LearnConstructor(int id, String name, boolean status1) {
		
		//Calling the default Constructor from parameterized Constructor 
		this();
		empId = id;
		empName = name;
		status = status1;
		System.out.println("I am from  Parameterized  Constructor");
	}
	LearnConstructor(String name1) {

		empName = name1;

	}
	public static void main(String[] args) {

//		LearnConstructor l = new LearnConstructor();
		LearnConstructor l1 = new LearnConstructor(1, "vino", true);
		System.out.println(l1.empId);
		System.out.println(l1.empName);
		System.out.println(l1.status);
		LearnConstructor l2 = new LearnConstructor("Vinothini");
		System.out.println(l2.empName);

	}

} 
