package constructor.example;

public class ConstructorChaining {
        //constructor chain, a constructor is called from another constructor in the same class this process is known as constructor chaining
	    //constructor chaining is achieved by using this keyword
	    //When need to call  one constructor to another constructor -->this keyword need to write in the beginning of the method body
	    //Use this constructor chaining is some in one constructor have id,name,dept and another constructor have only mark field, If we want to
	   //access id,name,dept of one constructor we can use this keyword and pass the instance variable in the another constructor and access it
		int id;
		String name;
		String dept;
		int mark;
        
		//Default 
		public ConstructorChaining() {
			this.id = 100;
			this.name = "vasanth";
			this.dept = "Mech";
		}

		
		//Parameterized
		public ConstructorChaining(int id, String name, String dept) {
			//here assign the local variable to instance variable
			
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		
		//This constructor have id,name,dept,mark but did not assign id,name,dept
		//By using constructor chaining in the initial function body we can access the variables(id,name,dept) from another constructor
		public ConstructorChaining(int id, String name, String dept,int mark) {
			
			//Here we are using this keyword and call the another constructor for getting id,name,dept 
			this(id,name,dept);
			this.mark=mark;
		}

		public static void main(String[] args) {
	       
			ConstructorChaining tk1 = new ConstructorChaining();
			System.out.println("The id is :" + tk1.id);
			System.out.println("The name  is :" + tk1.name);
			System.out.println("The dept is :" + tk1.dept);

			System.out.println("=============================");

			ConstructorChaining tk = new ConstructorChaining(200, "Vino", "IT");
			System.out.println("The id is :" + tk.id);
			System.out.println("The name  is :" + tk.name);
			System.out.println("The dept is :" + tk.dept);
			
			System.out.println("=============================");
			
			ConstructorChaining chain =new ConstructorChaining(300,"Selvi","ECE",90);
			System.out.println("The id is :" +chain.id);
			System.out.println("The name  is :" +chain.name);
			System.out.println("The dept is :" +chain.dept);
			System.out.println("The mark is :" +chain.mark);
		}

}
