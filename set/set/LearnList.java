package set.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		//List is FIFO
		//List is an interface
		//It will allows duplicates
		//syntax is --->List<data type>  <Variable name>=new ArrayList<data type>();
		// index is starts from 0
		// one way of assign the values
		// add the elements in the list
		list.add(50);
		list.add(80);
		list.add(60);
		list.add(40);
		list.add(90);
		list.add(10);
		// print the elements in the list
		System.out.println("The values of list is :" + list);
		// size of the list
		System.out.println("The size of the list is :" + list.size());
		// remove the element in the list using remove()
		list.remove(2);
		System.out.println("The values of after removing from the list is :" + list);
		// Retrieve the particular element from the list is
		System.out.println("The second value from the list is :" + list.get(1));
		// sort the elements using sort method
		Collections.sort(list);
		System.out.println("The elements after sorting is:" + list);

		System.out.println("==========================================");

		System.out.println("Elements are printed using for loop");

		// print the elements using for loop

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
		System.out.println("Elements are printed using for loop" + list);

		System.out.println("==========================================");

		// Declare a list
		List<Integer> list1 = new ArrayList<Integer>();

		// using collections method we can add the values in to the list
		Collections.addAll(list1, 10, 50, 30, 81, 45, 78, 56, 74);
		// print the elements
		System.out.println("The values of list1 is :" + list1);
		// size of the list
		System.out.println("The size of the list1 is :" + list1.size());
		// sort the elements using sort method
		Collections.sort(list1);
		System.out.println("The elements after sorting is:" + list1);

		// print the elements using for each loop
		//first is data type
		//second is variable
		//third is variable of list declared
		for (Integer each : list1) {

			System.out.println(each);

		}

		System.out.println("Elements are printed using for each:" + list1);

	}

}
