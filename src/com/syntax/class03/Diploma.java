package com.syntax.class03;

public class Diploma {
	public static void main(String[] args) {
		boolean diploma = true;
		double GPA = 3.6;

		if (diploma) {
			System.out.println("Congratulations");
			if (GPA >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You should to get a degree");
		}
		
		System.out.println("***************************************");

		double rate = 3.5;
		int price = 180000;
		if (rate > 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("User will consider buying");
			if (price > 200000) {
				System.out.println("Take a loan");
			} else {
				System.out.println("Pay cash");
			}
		}
		
		System.out.println("***************************************");

		boolean complited = true;
		int score = 88;

		if (complited) {
			if (score > 90) {
				System.out.println("A, Great Job");
			} else if (score > 80) {
				System.out.println("B, Well Done");
			} else if (score > 70) {
				System.out.println("C, Just Passed");
			} else {
				System.out.println("F, You failed");
			}
		} else {
			System.out.println("Not Complited");
		}

	}

}
