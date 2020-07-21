package com.syntax.class08;

import com.syntax.class09.Employee;

public class AccessToDifferentPackage {
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.name = "Igor";
		emp.lastName = "True";
//		emp.age = 29;
//		emp.salary = 150000;
//		emp.ssn = 123324355;
		
		emp.displayName();
//		emp.displayAge();
//		emp.displaySalary();
//		emp.displaySsn();
		
	}

}
