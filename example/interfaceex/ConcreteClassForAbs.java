package example.interfaceex;

public class ConcreteClassForAbs extends AbstractConstructor{

	public static void main(String[] args) {
		//create an object for sub class
		AbstractConstructor  a =new ConcreteClassForAbs();
		a.display();

	}

	@Override
	public void display() {
System.out.println("It is displayed method");		
	}

}
                                                                                                 