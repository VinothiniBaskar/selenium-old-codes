package constructor.example;

public class ThisKeyword {
	// We can't use global and local variables are same -->local variable means
	// inside the method parameters
	// but using this keyword we can use
	// this can be used to refer current class instance variable
	int id;
	String name;
	String dept;

	public ThisKeyword() {
		this.id = 100;
		this.name = "vasanth";
		this.dept = "Mech";
	}

	public ThisKeyword(int id, String name, String dept) {
		//here assign the local variable to instance variable
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public static void main(String[] args) {
       
		ThisKeyword tk1 = new ThisKeyword();
		System.out.println("The id is :" + tk1.id);
		System.out.println("The name  is :" + tk1.name);
		System.out.println("The dept is :" + tk1.dept);

		System.out.println("=============================");

		ThisKeyword tk = new ThisKeyword(200, "Vino", "IT");
		System.out.println("The id is :" + tk.id);
		System.out.println("The name  is :" + tk.name);
		System.out.println("The dept is :" + tk.dept);

	}

}
