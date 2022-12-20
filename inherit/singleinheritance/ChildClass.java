package inherit.singleinheritance;
//child class
public class ChildClass extends ParentClass {
    //Variable of child class with same variable name
	int a = 10;
	 //method of child class with same  method name
	public void display() {
		//Here we are using super keyword for accessing the variable of parent class with same name mentioned in child class but value is different
		System.out.println("The value of parent class is :"+super.a);
		//Here we are using super keyword for accessing the method of parent class with same name mentioned in child class but logic  is different
		//super keyword is used only if the classed are inherited within the package
		super.display();
		System.out.println("Child class of display method called :");

	}

	public static void main(String[] args) {
        //object is create for child class
		ChildClass c = new ChildClass();
		System.out.println("The value of a in the child class is :" + c.a);
        //call the method
		c.display();

	}

}
