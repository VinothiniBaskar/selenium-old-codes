package LogicalProgramOfArrayForCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Declare a String with data
		String str = "We learn java basics as part of java sessions in java week3";
		// Declare a string with temp and replace all with spaces
		String temp = str.replaceAll("\\n", " ");
		// Declare an char array and convert the string in to char array
		char[] ch = temp.toCharArray();
		// Declare a set
		Set<Character> charSet = new LinkedHashSet<Character>();
		// Iterate the char array
		for (char c : ch) {
			// check the duplicate items ,if items is there it will automatically removed in
			// charset obj
			if (charSet.add(c)) {
				charSet.add(c);
			}
		}
		// print the data
		System.out.println(charSet);

	}

}
