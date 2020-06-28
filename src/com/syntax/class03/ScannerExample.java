package com.syntax.class03;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name!");
		String name = scan.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("Enter you age as double!");
		double age = scan.nextDouble();
		System.out.println("Your name is " + name + " and age is " + age);
	}

}
