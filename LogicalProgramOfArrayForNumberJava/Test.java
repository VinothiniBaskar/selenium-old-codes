package LogicalProgramOfArrayForNumberJava;

public class Test {

	public static String reverseString(String input) {
		 input="testleaf";
     String rev="";
     for(int i=input.length()-1;i>=0;i--){
       rev=rev+input.charAt(i);
     }

System.out.println("The Reversed string is :"+rev);

     
   return input;
	}

}
