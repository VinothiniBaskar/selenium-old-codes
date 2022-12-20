package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindInterSectionCode {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();


		Collections.addAll(list, 3, 2, 11, 4, 6, 7);
		Collections.addAll(list1, 1, 2, 8, 4, 9, 7);
		list1.retainAll(list);
		

		System.out.println(list1);
		
//		if (list.contains(list1)) {
//			
//			System.out.println("The intersection of value is :"+list2);
//			
//		}

		

//		list.add(3);
//		list.add(2);
//		list.add(11);
//		list.add(4);
//		list.add(6);
//		list.add(7);
//
//		System.out.println(list);s
//		
//		list1.add(1);
//		list1.add(2);
//		list1.add(8);
//		list1.add(4);
//		list1.add(9);
//		list1.add(7);
//
//		System.out.println(list1);

	}

}
