package javabelo8;

import java.util.Comparator;

import model.Employee;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.id> arg1.id) {
			return -1;
		}else if(arg0.id< arg1.id) {
			return 1;
		}
		return 0;
	}

}
