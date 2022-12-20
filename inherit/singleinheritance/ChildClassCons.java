package inherit.singleinheritance;

public class ChildClassCons extends ParentClassCons {
	 
	
	//Here super() -->Implicitly called by the JVM ( parent class constructor )
	//First parent constructor executed and the followed by the child class constructor
	 public  ChildClassCons() {
		 System.out.println("Child class of constructor");

	}
 
	public static void main(String[] args) {
		//Whenever object is created for an child class immediately  call the super() method and it calls the parent class constructor 
		//and then child class constructor is executed
		ChildClassCons obj=new ChildClassCons();
	
	
	}

}
