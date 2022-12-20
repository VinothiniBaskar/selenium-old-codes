package LogicalProgramOfArrayForCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Declare an ArrayList of type Integer
		List<Integer> list = new ArrayList<Integer>();
		// add the elements in lists
		Collections.addAll(list, 3, 2, 11, 4, 6, 7);
		System.out.println("The elements of list before sorting  is :" + list);

		// sort the array
		Collections.sort(list);

		System.out.println("The elements of list after sorting is :" + list);

		// print the second value from last
		System.out.println("Second element from the last is :" + list.get(4));

	}

}
