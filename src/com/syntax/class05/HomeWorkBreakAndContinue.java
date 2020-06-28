package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkBreakAndContinue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int start, end, even = 0, odd = 0;
//		System.out.println("Enter a starting number");
//		start = scan.nextInt();
//		System.out.println("Enter an ending number");
//		end = scan.nextInt();
//
//		for (int i = start; i <= end; i++) {
//			if (i % 2 == 0) {
//				even += i;
//			} else {
//				odd += i;
//			}
//		}
//		System.out.println("Sum of even nums is: " + even);
//		System.out.println("Sum of add nums is: " + odd);
//		System.out.println("***************************************");
//		
//		int sum = 0;
//		for (int k = 1; k <=100; k++) {
//			sum += k;
//		}
//		System.out.println("Sum of all humbers from 1 to 100 is: " + sum);
//		System.out.println("***************************************");
//
//		System.out.println("What item do you wanna get?");
//		String item = scan.nextLine();
//
//		System.out.println("What is the price of it?");
//		double price = scan.nextDouble();
//		double amount = 0;
//		double dep = 0;
//		System.out.println("Put the money, huh");
//		for (int i = 0; i < price; i += dep) {
//			System.out.println("You supposed to pay " + (price - amount) + " more");
//			dep = scan.nextDouble();
//			amount += dep;
//
//		}
//
//		System.err.println("You finally get " + item + "!!");

		for (int i = 0; i < 10; i++) {
			{
				for (int j = 0; j < 10; j++) {
					{
						for (int k = 0; k < 10; k++) {
							{
								for (int l = 1; l < 10; l++) {
									System.out.println(i + "" + j + k  + l);
								}
							}
						}
					}
				}
			}
			
		}

	}

}
