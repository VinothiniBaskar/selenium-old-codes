package assignment;

public class Dog extends Animal {
	String colour="Black";
public  void printColour() { 
	System.out.println("The colour of child class:"+colour);
	System.out.println("The colour of base class is :"+super.colour);

	}

}
