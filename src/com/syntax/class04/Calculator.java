package com.syntax.class04;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(":");
		double a = scan.nextDouble();
		char x = scan.next().charAt(0);
		double b = scan.nextDouble();
		double sum = 0;

		switch (x) {

		case '+':
			sum = a + b;
			break;
		case '-':
			sum = a - b;
			break;
		case '*':
			sum = a * b;
			break;
		case '/':
			sum = a / b;
			break;
		default:
			sum = 0;
		}
		System.err.println(sum);

		scan.close();

	}

}
