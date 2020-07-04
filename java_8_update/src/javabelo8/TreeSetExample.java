package javabelo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import model.Employee;



public class TreeSetExample {

	public static void main(String[] args) {
		Employee emp1= new Employee("Sam", 410, "Pune");
		Employee emp2= new Employee("Ram", 100, "Kolkata");
		Employee emp3= new Employee("Stephen", 560, "US");
		Employee emp4= new Employee("Goerge", 850, "UK");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);employeeList.add(emp2);employeeList.add(emp3);employeeList.add(emp4);
		System.out.println("Before sorting");
		for(Employee emp :employeeList){
			System.out.println(emp.id);
		}
		Set<Employee> treeSet= new TreeSet<Employee>(new EmployeeComparator());
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);
		Set treeSet1= new TreeSet();
		treeSet1.add(4);
		treeSet1.add(1);
		treeSet1.add(3);
		treeSet1.add(2);
		
		System.out.println("After  sorting");
		System.out.println(treeSet1);
		System.out.println("After  sorting Employee");
		treeSet.forEach(emp -> System.out.println(emp.id));
	}
}
