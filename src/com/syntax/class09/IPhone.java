package com.syntax.class09;

public class IPhone {
	
	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;
	
	String model;
	String color;
	int memory;
	double price;
	
	void displayInfo() {
		
		System.out.println("Brand is " + brand + " operation system is " + OS + " avaliable of touch screen: " + touchScreen);
	}
	
	void displayDetails() {
		
		System.out.println("We build iPhone " + model + " memory is " + memory +" color is " + color + " $" + price);
	}
	
	
	
	
	public static void main (String [] args) {
	
		IPhone phone1 = new IPhone();
		
		IPhone.touchScreen = false;
		
		phone1.model = "11 Pro";
		phone1.color = "Red";
		phone1.memory = 512;
		phone1.price = 999;
		
		phone1.displayDetails();
		phone1.displayInfo();
		
		IPhone phone2 = new IPhone();
		
		
		phone2.model = "Se7en";
		phone2.color = "Black";
		phone2.memory = 32;
		phone2.price = 499;
		
		phone2.displayDetails();
		phone2.displayInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
