package com.syntax.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		try {
			int x = sc.nextInt();
			System.out.println(x);

		} catch (Exception inMM) {
			System.out.println(inMM);
		}

		System.out.println("End");

		sc.close();

	}

}
