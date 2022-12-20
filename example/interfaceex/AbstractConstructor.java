package example.interfaceex;

public abstract class AbstractConstructor {
	//When we create an object for an sub class ,automatically AbstractConstructor called
	//Then call the sub class methods
	public AbstractConstructor() {
		int a=10;
		System.out.println(a);
	}
	public  abstract  void display();

}
