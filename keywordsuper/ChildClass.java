package keywordsuper;

public class ChildClass extends BaseClass {
	//Super keyword is used to call the parent class methods
	//It can be acheived only if the classes are inherited
	//Here we are using super keyword for accessing the  instance varible  from the BaseClass
	//First preference of method is child class on;y
	public  void display() {
		System.out.println("The value of the instance varible of a is :"+super.a);

	}
	//Here using super keyword for call the Base class method 
	public void name() {
		//call the method of baseclass 
		super.name();
		//Here implemention is differnt but using the same method name from BaseClass
		System.out.println("Name of child class is Vasanth");

	}
	
	


	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		//Call the mwthod
		c.display();
		c.name();
		c.age();
		//Without using super keyword accessing the  varibales using inheritence concept
		System.out.println("The dept name of Base class by without using super keyword: "+c.dept);
		//Without using super keyword accessing the methods using inheritence concept
		c.clgName();


	}

}
