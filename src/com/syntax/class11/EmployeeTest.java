package com.syntax.class11;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setSalary(100000);
		double salary = emp.getSalary();
		System.out.println(salary);
		
		emp.setAge(15);
		System.out.println(emp.getAge());
		
		emp.setEmpID(1000000001);
		System.out.println(emp.getEmpID());
		
	}

}
