package com.syntax.class09;

public class BetterCar {

	public static String make = "Porsche";
	protected String model, color;
	int year;
	private double price;

	public void displayInfo() {

		System.out.println(color + " " + make + " " + model + " of " + year + " for " + price);
	}
	
	
	BetterCar(String carMake, String carColor, int carYear, double carPrice) {
		model = carMake;
		color = carColor;
		year = carYear;
		price = carPrice;
		
	}
	
	public static void main(String[] args) {
		BetterCar auto = new BetterCar("911 Targa", "Blue", 2020, 140000);
		
		auto.displayInfo();
		
		
		
		
	}
	
	
	
	
	
	

}
