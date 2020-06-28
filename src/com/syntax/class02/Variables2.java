package com.syntax.class02;

public class Variables2 {
	public static void main(String[] args) {
		String name = "Igor";
		String lastName = "Trushkov";
		int grade = 30;
		String city = "Washington";
		String state = "DC";
		String phoneNumber = "220 202 20 02";

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println("************************");

		grade = 29;
		city = "Gaithersburg";
		state = "MD";
		phoneNumber = "400 400 40 40";

		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println("************************");

		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber);
	}

}
