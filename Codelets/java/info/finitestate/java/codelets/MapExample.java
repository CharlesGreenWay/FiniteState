package info.finitestate.java.codelets;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> employees = new HashMap<>(3);
		employees.put(1, "Green");
		employees.put(2, "Daniel");
		employees.put(3, "Jonathan");
		
		String empName = employees.get(1);
		System.out.println("Employee with id 1 is " + empName);
		
		// Removing a record from the map will return the removed value
		String resignedEmployee = employees.remove(3);
		System.out.println("Employee who resigned was " + resignedEmployee);
		
	}
}
