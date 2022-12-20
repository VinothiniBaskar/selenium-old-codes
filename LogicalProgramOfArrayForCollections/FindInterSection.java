package LogicalProgramOfArrayForCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {

		// Declare an ArrayList of type Integer
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();

		// add the elements in lists
		Collections.addAll(list, 3, 2, 11, 4, 6, 7);
		Collections.addAll(list1, 1, 2, 8, 4, 9, 7);

		// print the elements of list
		System.out.println("The elements of list is :" + list);

		// print the elements of list1
		System.out.println("The elements of list1 is :" + list1);
		// check the intersection elements
		list1.retainAll(list);

		// Print the elements intersection elements
		System.out.println("The intersection of value is :" + list1);
	}

}
