package com.syntax.class03;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		int num1 = scan.nextInt();

		System.out.println("Enter another number");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " is bigger than " + num1);
		} else {
			System.out.println(num1 + " equal to " + num2);
		}

		scan.close();
	}

}
