package com.syntax.class07;

public class Factory {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		
		System.out.println("access using car1");
		
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		

		Car car2 = new Car();
		car2.make = "Porsche";
		car2.model = "991";
		car2.color = "White";
		car2.year = 2018;
		car2.speed = 250;

		System.out.println("The 2nd car is " + car2.color + " " + car2.make + " " + car2.model);

		Car car3 = new Car();
		car3.make = "Ferrari";
		car3.model = "Enzo";
		car3.color = "Red";
		car3.year = 2010;
		car3.speed = 270;

		System.out.println("The 3rd car is " + car3.make + " " + car3.model + " " + car3.color + " " + car3.year + " "
				+ car3.speed);

		Car car4 = new Car();
		car4.make = "Lada";
		car4.model = "Priora";
		car4.color = "Sochi";
		car4.year = 2010;
		car4.speed = 110;

	}

}
