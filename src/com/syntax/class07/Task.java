package com.syntax.class07;

public class Task {

	void compare(int a, int b) {
		if (a > b) {
			System.out.println(a + " is bigger than " + b);
		} else {
			System.out.println(b + " is bigger than " + a);
		}
	}

	void oddEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}

	void palindrome(String name) {
		name.toLowerCase();
		String name2 = "";

		for (int i = name.length()-1; i >=0; i--) {
			name2 += name.charAt(i);
		}

		if (name.equals(name2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	void hello(String country) {
		String hello = "";
		switch (country.toLowerCase()) {
		case "us":
		case "england":
		case "australia":
			hello = "Hello";
			break;
		case "spain":
		case "mexico":
			hello = "Buenos dios";
			break;
		case "russia":
		case "ukraine":
		case "belarussia":
			hello = "Privet";
			break;
		case "germany":
		case "austria":
			hello = "Hallo";
			break;
		case "china":
			hello = "Nihao";
			break;
		default:
			hello = "Unknown";
		}
		System.out.println(hello);

	}

}
