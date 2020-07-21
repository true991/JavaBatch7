package com.syntax.class09;

public class ConstructorType {
	ConstructorType() {
		System.out.println("Imma constr");
	}
	
	ConstructorType(String str) {
		System.out.println("With a string");
	}
	
	ConstructorType(double num) {
		System.out.println("With a double");
	}
	
	ConstructorType(String name, int age) {
		System.out.println("With two parameters");
	}

	
	
		 	
	
	
	public static void main(String[] args) {
		ConstructorType obj = new ConstructorType("Zorro", 99);
		System.out.println("Code inside");
		
		System.out.println(obj);
	}
	
	

}
