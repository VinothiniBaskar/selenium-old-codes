package LogicalProgramOfArrayForNumberJava;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0,secondNum=1,sum=0,input=8;
		System.out.print(firstNum + " " + secondNum);

		for (int i = 2; i <=input; i++) {
			//add first number and second number to store in sum
			sum=firstNum+secondNum;
			//assign the second number to first number
			firstNum=secondNum;
			//Assign second number to sum
			secondNum=sum;
			//print the sum
			System.out.print( " " + sum);
		}

	}

}
