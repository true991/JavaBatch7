package com.syntax.class10;

public class Employee {
	
	double salary;
	
	public void getPaid() { // overriden method
		System.out.println("Gets paid salary = "+salary);
	}

}

class Contractor extends Employee {
	double hourlyRate;
	
	public void getPaid() { // overriding method
		System.out.println("Gets paid hourly = " + hourlyRate);
	}
	
}
class FullTime extends Employee {
	
}
