package info.finitestate.codelets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	
	public static void main(String[] args) {
		String[] array = {"x", "f", "a", "D", "r"};
		Arrays.sort(array);
		System.out.println("Sorted Array (natural ordering)	: " + Arrays.toString(array));
		//Custom sorting can be done using overloaded sort method in Java 7 and earlier.
		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted Array (case insensitive)	: " + Arrays.toString(array));
		//In java 8, we can use method references
		Arrays.sort(array, String::compareToIgnoreCase);
		// For reverse sort, we can use reversed()
		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println("Reverse sorting : " + Arrays.toString(array));
		
		List<Integer> list = Arrays.asList(5, 3, 8, 2, 1);
		Collections.sort(list);	// Java 7 and earlier using Collections utility Class
		System.out.println("Sorted List : " + list);

		list.sort(null);	// In Java 8, we can use the newly added sort method in the List class
		System.out.println("Java 8 Natural ordering : " + list);
		// Sorting using streams
		List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order using streams : " +  reverseOrder);
		
		// Sorting using Lambda Expressions
		list.sort((Integer i1, Integer i2) -> i1.compareTo(i2));
		System.out.println("Sorting using lambda expressions :  " + list);
	}
}
