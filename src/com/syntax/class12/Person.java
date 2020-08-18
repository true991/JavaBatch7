package com.syntax.class12;

public class Person {
	
	private String name, lastName;
	private int age, salary;
	
	Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public void info() {
		
		System.out.println(name + " - " + lastName + " - " + age + " - " + salary);
		
	}
	
	
}
