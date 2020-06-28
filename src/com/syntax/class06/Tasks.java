package com.syntax.class06;

public class Tasks {
	public static void main(String[] args) {

		String[] cars = { "BMW", "BENZ", "LADA", "OPEL", "VW", "PORSCHE" };

		for (String auto : cars) {
			System.out.print(auto + " - ");
		}

		System.out.println();

		for (int j = 0; j < cars.length; j++) {
			System.out.print(cars[j] + " / ");
		}
		System.out.println();
		System.out.println("=================================");

		int[] numbers = { 20, 30, 40, 50, 60 };
		int total = 0;
		for (int k = 0; k < numbers.length; k++) {
			total += numbers[k];
		}
		System.out.println("The sum is: " + total);

		int total2 = 0;
		for (int sum : numbers) {
			total2 += sum;
		}
		System.out.println("The 2nd sum is: " + total2);
		System.out.println("=================================");

		String[] countries = { "US", "Russia", "France", "GBR" };

		String capital;

		for (int w = 0; w < countries.length; w++) {
			switch (countries[w].toLowerCase()) {
			case "us":
				capital = "Washington,DC";
				System.out.println(capital);
				break;

			case "russia":
				capital = "Moscow";
				System.out.println(capital);
				break;
			case "france":
				capital = "Paris";
				System.out.println(capital);
				break;
			case "gbr":
				capital = "London";
				System.out.println(capital);
				break;

			}

		}
	}
}
