package LogicalProgramOfArrayForNumberJava;

public class AmstrongNumber {

	public static void main(String[] args) {
		// AmstrongNumber -->153=1*1*1+5*5*5*+3*3*3
		// Number =1+125+27=153
		// Original num and is equal to cube of that number is same which is called as
		// AmstrongNumber
		int num = 153, sum = 0;
		int r, temp;
		temp = num;
		// 1st num=153
		// 2ns num=15
		// 3rd num=1
		while (num > 0) {
			// 1st-->r=153%10 --->r=3
			// 2nd--->r=15%10--->5
			// 3rd--->r=1%10--->1
			r = num % 10;

			// 1st-->num=153/10-->15
			// 2nd-->num=15/10-->1
			// 3rd-->num=1/10-->0
			num = num / 10;

			// 1st sum=0+3*3*3=0+27--->sum=27
			// 2nd sum=27+5*5*5=27+125--->sum=152
			// 3rd sum=152+1*1*1=152+1--->sum=153

			sum = sum + r * r * r;

		}
		if (temp == sum) {
			System.out.println("It is a Amstrong number");
		} else {
			System.out.println("It is not a Amstrong number ");
		}

	}

}
