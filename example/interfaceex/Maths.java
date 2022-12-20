package example.interfaceex;

public  abstract class Maths {
	
	public abstract void sum();
	public abstract void sub();
	
public	 Maths() {
	System.out.println("constructor called for abstract class");
}
	
	public void mul() {
		int a=10,b=5,c;
		c=a*b;
		System.out.println("The mul is :"+c);
	}
	
	

}
