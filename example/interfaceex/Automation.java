package example.interfaceex;

//inherit the abstract class in concrete class
public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		
		//create an object and call all the interface methods and abstract methods
		Automation a = new Automation();
		a.java();
		a.Selenium();
		a.python();
		a.ruby();
		a.cSharp();
	}

	public void java() {
		System.out.println("It is a Java Langauge Learning");
	}

	public void Selenium() {
		System.out.println("It is a  Selenium Learning");

	}

	public void python() {
		System.out.println("It is a  python Learning");

	}

	public void ruby() {
		System.out.println("It is a  ruby  Learning");

	}

}
