package LogicalProgramOfArrayForNumberJava;


public class Factorial {

	public static void main(String[] args) {
		
		//Declare an input --->output---> 5*4*3*2*1 =120
		int num=5; 
		//Declare an variable fact as 1
		int fact=1;
		//Logic for to find factorial of given number
		for (int i = 1; i <=num; i++) {
			//  i=1 -->fact=1*1-->fact=1
			//i=2--->fact=1*2--->fact=2
			fact=fact*i;
		}
		System.out.println("The Factorial of Given number is :"+""+fact);

	}

}
