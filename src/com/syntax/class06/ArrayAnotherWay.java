package com.syntax.class06;

public class ArrayAnotherWay {
	public static void main(String[] args) {

		// We creating an array and stored initial values
		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursda", "Friday" };

		// Printing element with index [3]
		System.out.println(weekdays[3]);

		// Re-assigning
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);

		double[] balances = { 10000, 2400.50, 325.5 };

		// 1st way
		System.out.println("total money is: " + (balances[0] + balances[1] + balances[2]));

		// 2nd way
		int total1 = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("total money is: " + total1);

		// 3rd way
		int total2 = (int) (balances[0] + balances[1] + balances[2]);
		System.out.println("total money is: " + total2);

	}

}
