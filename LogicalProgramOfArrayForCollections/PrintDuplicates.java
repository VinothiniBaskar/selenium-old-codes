package LogicalProgramOfArrayForCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		// Declare an list for store the elements
		List<Integer> list = new ArrayList<Integer>();
		// Add the elements into the list
		Collections.addAll(list, 10, 12, 10, 13, 12);

		// Declare an Set for print duplicate elements
		Set<Integer> set = new LinkedHashSet<Integer>();
		// create a for loop for iterating elements
		for (int duplicates : list) {
			// Check the duplicate elements in the set and add into the set variable
			if (!set.add(duplicates)) {
				// print the duplicates
				System.out.println(duplicates);
			}

		}

	}
}
