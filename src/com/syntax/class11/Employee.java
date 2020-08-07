package com.syntax.class11;

public class Employee {

	// make variable as private

	private double salary;
	private int age, empID;

	// create public methods (getters and setters) to give access to private
	// variables

	// creating getters

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public int getEmpID() {
		return empID;
	}

	// creating setters

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		if (age > 17) {
			this.age = age;
		} 
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

}


