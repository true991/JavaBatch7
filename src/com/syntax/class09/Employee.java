package com.syntax.class09;

public class Employee {

	public static String company;

	public String name, lastName; // any class from any package in the project
	protected int age;            // if class within same package it can access all proteccted members
	double salary;                // if class within same package it can access all default members
	private long ssn;             // only it is own class/same can have an access to private members

	public static void displayAll() {
		System.out.println(company + " company");
	}

	public void displayName() {
		System.out.println("Name is " + name + " " + lastName);
	}

	protected void displayAge() {
		System.out.println("Age is " + age);
	}

	void displaySalary() {
		System.out.println("Salary is " + salary);

	}

	private void displaySsn() {
		System.out.println("SSN is " + ssn);

	}
	
	
	public static void main(String[] args) {
		company = "Google";
		
		Employee emp = new Employee();
		emp.name = "Igor";
		emp.lastName = "True";
		emp.age = 29;
		emp.salary = 150000;
		emp.ssn = 123324355;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySsn();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
