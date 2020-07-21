package com.syntax.class09;

public class Car {
	
	public static String make;
	protected String model;
	int year;
	private double price;	
	
	
	public void displayInfo () {
		
		System.out.println(make + " " + model + " of " + year + " for " + price);
	}
	
	Car() {
		System.out.println("Imma constructor");
	}
	
	public static void main(String[] args) {
		
		Car auto = new Car();
		 
//			Car     ----> class name
//			auto    ----> reference variable
//			new     ----> keyword
//			Car();  ----> calling Constructor 
		
		make = "BMW";
		auto.model = "430i";
		auto.year = 2020;
		auto.price = 80000;
		
		auto.displayInfo();
	}
}
