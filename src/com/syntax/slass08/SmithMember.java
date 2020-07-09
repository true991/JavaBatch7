package com.syntax.slass08;

public class SmithMember {
	
	String firstName;
	static String lastName;
	int age;
	
	public void printInfo() {
		System.out.println(firstName + " " + lastName + " is " + age + " y.o.");
	}
	
	public static void main(String[] args) {
		
		SmithMember mem1 = new SmithMember();
		
		mem1.firstName = "John";
		SmithMember.lastName = "Smith";
		mem1.age = 45;
		mem1.printInfo();
		
		SmithMember mem2 = new SmithMember();
		
		mem2.firstName = "Julia";
		
		mem2.age = 42;
		mem2.printInfo();
		
		
	}

}
