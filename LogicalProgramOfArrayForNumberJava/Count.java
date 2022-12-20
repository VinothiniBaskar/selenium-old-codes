package LogicalProgramOfArrayForNumberJava;

public class Count {

	public static void main(String[] args) {
		int count=0;
		do {
			System.out.println("Test");
			count++;
		} while(count<10);
		
		byte x=127;
		x++;
		x++;
		System.out.println(x);
		
		String s1="vino";
		String s2="baskar";
		System.out.println(s1.concat(s2));
		
		
		int a[]= {0,2,4,1,3};
		for (int i = 0; i < a.length; i++) {
			a[i]=a[(a[i]+3)%a.length];
			System.out.println(a[1]);
		}
		
		int integer=12;
		char String='v';
		System.out.println(integer);
		System.out.println(String);
		
		
		int j;
		for ( j = 0; j< 6; j++) {
			if (j>3) {
				continue;
			}
		}

     System.out.println(j);
     
     
     String s11="Hellow";
     System.out.println(s11.indexOf(s11));
     
     int x1=5;
     x1*=(3+7);
     System.out.println(x1);
     
     
     String str="abcde";
     System.out.println(str.substring(1, 3));
     
	}

}
