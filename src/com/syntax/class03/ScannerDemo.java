package com.syntax.class03;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Write some text and press enter!");
		String txt = scan.nextLine();
		System.out.println("*************");
		System.out.println("You have written: " + txt);

		System.out.println("Enter age! It should be a number!");
		int age = scan.nextInt();
		System.out.println("The age you entered is " + age);

		scan.close();

	}

}
