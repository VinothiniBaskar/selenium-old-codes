package example.interfaceex;

public  class Subject  extends  Maths {

	public static void main(String[] args) {
		Subject s=new Subject();
		s.sum();
		s.sub();
		s.mul();
		

	}

	@Override
	public void sum() {
		int a=10,b=5,c;
		c=a+b;
		System.out.println("The sum  is :"+c);		
	}

	@Override
	public void sub() {
		int a=10,b=5,c;
		c=a-b;
		System.out.println("The sub is :"+c);		
	}

	
}
