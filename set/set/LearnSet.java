package set.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		String companyName = "google";

		char[] ch = companyName.toCharArray();

		Set<Character> str = new TreeSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			str.add(ch[i]);

		}

		System.out.println(str.size());
		System.out.println(str);
		
		System.out.println("======================================");

		// Set is an interface
		// Set is not allowed duplicates
		// Set has three types
		// HashSet --> based on hashing algorithm(random order)
		// LinkedHashSet--->based on insertion order(FIFO)
		// TreeSet---->based on ASCII code(A to Z) and (0 to 100)

		// HashSet example
		// syntax-->Set <data type> <variable name>=new HashSet<data type>();
		Set<Integer> hashset = new HashSet<Integer>();

		// same as list for add,remove,size
		// but here get method is not allowed ,if we want to get the element of
		// particular element
		// need to convert in to list in that list we can get the element

		Collections.addAll(hashset, 20, 20, 41, 526, 465, 8, 96, 46);
		System.out.println("The elements of list is using hashset :" + hashset);
		// size of the list
		System.out.println("The size of the list is :" + hashset.size());
		// print the elements using for loop
		for (int i = 0; i < hashset.size(); i++) {
		}
		System.out.println(hashset);
		
		System.out.println("======================================");

		// LinkedHashSet example
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		Collections.addAll(linkedHashSet, "Vino", "Vasanth", "Selvi", "Baskar");
		// print the names using for each
		for (String each : linkedHashSet) {
			System.out.println(each);
		}
		System.out.println("The names of list is using LinkedHashSet :" + linkedHashSet);
		
		
		
		System.out.println("======================================");
		

		// TreeSet example
		// for using TreeSet automatically duplicates are removed
		// automatically display in A to z and 0 to 100
		Set<Character> treeSet = new TreeSet<Character>();

		Collections.addAll(treeSet, 'b', 'z', 'f', 'k');
		// print the names using for each
		// first is data type
		// second is variable
		// third is variable of set declared
		for (Character each : treeSet) {
			System.out.println(each);
		}
		System.out.println("The  Character of list is using TreeSet :" + treeSet);

	}

}
