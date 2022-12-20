package LogicalProgramOfArrayForNumberJava;

public class PalindromeNumber {

	public static void main(String[] args) {
		int reminder, sum = 0;
		int number = 131;
		int temp = number;
        //number=131>0
		//number=13
		//number=1
		while (number > 0) {
			//Get the reminder
			//1st-->r=131%10 -->1
			//2nd-->r=13%10--->3
			//3rd--->r=1%10--->1
			reminder = number % 10;
			//1st-->sum=(0*10)+1 ==>sum=0+1--->sum=1
			//2nd--->sum=(1*10)+3==>sum=10+3--->sum=-13
			//3rd--->sum=(13*10)+1===>sum=130+1--->sum=131
			sum = (sum * 10) + reminder;
			//Get the quotient
			//1st-->num=131/10-->13
			//2nd --->num=13/10--->1
			//3rd--->num=1/10--->0
			number = number / 10;

		}
		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" Not a Palindrome");

		}

	}

}
