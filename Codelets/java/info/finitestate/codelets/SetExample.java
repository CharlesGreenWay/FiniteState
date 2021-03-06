package info.finitestate.codelets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		Set<String> uniqueNames = new HashSet<>(5);
		uniqueNames.add("Green");
		uniqueNames.add("Joshua");
		uniqueNames.add("Mark");
		uniqueNames.add("Daniel");
		uniqueNames.add("Bar");
		
		// Status of adding duplicate name in the Set
		if (!uniqueNames.add("Joshua")) {
			System.out.println("Duplicate elements' addition gets discarded!!! ");
		}
		System.out.println("Unique elements in the collection : " + uniqueNames);
		
		// Removing the elements from the Set
		if (uniqueNames.remove("Mark")) {
			System.out.println("Removal of Mark from the set is successful.");
		}
		
		// Removal of elements while looping.
		Iterator<String> iterator = uniqueNames.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			if (name.equals("Joshua")) {
				// Removal of elements from the Set is handled via Iterator instead of the Set(original Collection)
				iterator.remove();
			}
		}
		System.out.println("Names in the set after removal : " + uniqueNames);
	}
}
