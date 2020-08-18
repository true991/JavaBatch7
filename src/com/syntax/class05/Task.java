package com.syntax.class05;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		Scanner scan = new Scanner(System.in);

		int t = 1;

		do {
			System.out.println("Would you like a new credit card?");
			String ans = scan.next();
			t++;
			if (ans.equals("yes")) {
				break;
			}
		} while (t <= 10);

		scan.close();

	}

}
