package java_8;

import java.util.Set;
import java.util.TreeSet;

import model.Employee;



public class TreeSetExample {

	public static void main(String[] args) {
		Employee emp1= new Employee("Sam", 410, "Pune");
		Employee emp2= new Employee("Ram", 100, "Kolkata");
		Employee emp3= new Employee("Stephen", 560, "US");
		Employee emp4= new Employee("Goerge", 850, "UK");
		
		Set<Employee> employeeSet = new TreeSet<Employee>((obj1,obj2)->{
			return ((obj1.id>obj2.id)?-1:(obj1.id<obj2.id)?1:0);
		});
		employeeSet.add(emp1);employeeSet.add(emp2);employeeSet.add(emp3);employeeSet.add(emp4);
		System.out.println("After sorting");
		employeeSet.forEach(emp->System.out.println("--: "+emp.id));
		
		
	}

}
