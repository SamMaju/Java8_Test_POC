package javabelo8;

import java.util.Map;
import java.util.TreeMap;

import model.Employee;

public class TreeMapExample {

	public static void main(String[] args) {
		Employee emp1= new Employee("Sam", 410, "Pune");
		Employee emp2= new Employee("Ram", 100, "Kolkata");
		Employee emp3= new Employee("Stephen", 560, "US");
		Employee emp4= new Employee("Goerge", 850, "UK");
		
		
		Map employeeMap= new TreeMap<Integer,Employee>();
		employeeMap.put(5, emp1);
		employeeMap.put(2, emp2);
		employeeMap.put(3, emp3);
		employeeMap.put(4, emp4);
		
			System.out.println("********: "+employeeMap.keySet());
	}

}
