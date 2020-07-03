package com.syntax.class07;

import java.util.Scanner;

public class HM1 {
	public static void main(String[] args) {
		String str = "aaaWaaa";
		if (!str.isEmpty()) {
			if (str.length() > 2) {
				if (str.length() % 2 == 1) {
					System.out.println(str.charAt(str.length() / 2));
				}
			}

		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Mom's name");
//		String mom = scan.nextLine();
//
//		System.out.println("Dad's name");
//		String dad = scan.nextLine();
//
//		System.out.println("Boy or Girl?");
//		String gender = scan.nextLine();
//		String name = "";
//
//		if (gender.equalsIgnoreCase("boy")) {
//			name = dad.substring(0, dad.length() / 2) + mom.substring(mom.length() / 2);
//		}
//		if (gender.equalsIgnoreCase("girl")) {
//			name = mom.substring(0, mom.length() / 2) + dad.substring(dad.length() / 2);
//		}
//
//		System.out.println("Sugested name is " + name);
//		
//		
		String str1 = "Sunday";

		for (int i = str1.length() - 1; i >= 0; i--) {
			char letter = str1.charAt(i);
			System.out.print(letter);

		}

	}

}
