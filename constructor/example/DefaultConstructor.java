package constructor.example;

public class DefaultConstructor {
	// Declare a global variables
	int stuId;
	String stuName;
	boolean status;

	
	//Default constructor method
  DefaultConstructor() {//2
		stuId=100;
		stuName="Vino";
		status=true;
		
		System.out.println("The Default Constructor is called ");
	}
	
	//Parameterized constructor
	 DefaultConstructor(int id,String name,boolean status1) {//2
		 stuId=id;
		 stuName=name;
		 status=status1;
		System.out.println("The Parameterized   Constructor is called ");
	}
	 
	//Parameterized constructor
		 DefaultConstructor(String Learners) {//2
			 stuName=Learners;
			System.out.println("The Parameterized   Constructor  with 1 param is called ");
		}

	public static void main(String[] args) {
		// create an object for the class for Default Constructor
		DefaultConstructor obj = new DefaultConstructor();// 1
		// use that object and pass the variables
		System.out.println("The Dafault value of id is :" + obj.stuId);
		System.out.println("The Dafault value of name is :" + obj.stuName);
		System.out.println("The Dafault value of  status is :" + obj.status);
		
		System.out.println("==========================================");
		
		//create an object for Parameterized constructor with 3
		DefaultConstructor obj1=new DefaultConstructor(200,"Selvi",true);
		System.out.println("The Parameterized Constructor value of id is :" + obj1.stuId);
		System.out.println("The Parameterized Constructor value of name is :" + obj1.stuName);
		System.out.println("The Parameterized Constructor value of  status is :" + obj1.status);
				
		System.out.println("==========================================");		
		
		//create an object for Parameterized constructor with 1
		DefaultConstructor obj2=new DefaultConstructor("Vinothini");
		System.out.println("The  name of the learners is :"+obj2.stuName);

	}

}
