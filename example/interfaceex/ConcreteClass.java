package example.interfaceex;

public class ConcreteClass implements Lanauge {

	public static void main(String[] args) {
		
		ConcreteClass c=new ConcreteClass();
		c.phyton();
		c.Selenium();

	}

	public void Selenium() {
		System.out.println("It is Selenium function implementation");
		
	}

	public void phyton() {
		System.out.println("It is phyton function implementation");

	}

}
