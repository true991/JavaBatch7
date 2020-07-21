
package com.syntax.class10;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.salary = 90000;
		emp.getPaid();
		
		Contractor ct = new Contractor();
		ct.hourlyRate = 50;
		ct.getPaid();
		
		FullTime ft = new FullTime();
		ft.salary = 100000;
		ft.getPaid();
	}

}
