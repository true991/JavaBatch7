package com.syntax.class04;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		int hour = 11;
		String dayTime;
		if (hour >= 1 && hour <= 11) {
			dayTime = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
		} else {
			dayTime = "Invalid data";
		}

		if (!dayTime.equalsIgnoreCase("InvALid data")) {
			System.out.println("It is " + dayTime + " right now!");
		} else {
			System.err.println("Error");
		}

		System.out.println("*****************************");

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your bithday month?");
		String month = scan.nextLine();
		String season;

		if (month.equals("December") || month.equals("January") || month.contentEquals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.contentEquals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.contentEquals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.contentEquals("Novomber")) {
			season = "Fall";
		} else {
			season = "Error";
		}

		if (!season.equals("Error")) {
			System.out.println("You were born in " + season);
		} else {
			System.err.println("Invalid data");
		}

		scan.close();

	}

}
