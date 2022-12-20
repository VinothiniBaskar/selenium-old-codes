package LogicalProgramOfArrayForNumberJava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// Anagram is both the strings and length should be equal
		// str2 is act and str2 is cat ,here both letters are same but meaning is
		// differs
		// like anagram is all the letters contains in word but it gives different
		// meaning

		// Declare a string1
		String str1 = "act";
		// Convert into charArray
		char[] ch1 = str1.toCharArray();
		// sort the array
		Arrays.sort(ch1);
		System.out.println(ch1);

		// Declare a string2
		String str2 = "cat";
		// convert into charArray
		char[] ch2 = str2.toCharArray();
		// Sort the array
		Arrays.sort(ch2);
		System.out.println(ch2);

		// Declare boolean value

		boolean banagram = true;

		for (int i = 0; i < ch2.length; i++) {
			// check whether both the arrays are equal
			if (ch1[i] != ch2[i]) {
				// print it is not anagram
				System.out.println("Not Anagram");
				banagram = false;
				break;

			}
		}
		if (banagram) {
			System.out.println(" Anagram");
		}

	}

}
