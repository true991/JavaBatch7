package com.syntax.class04;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
//		int x = 1;
//		
//		while (x < 20) {
//			if (x%2 ==1) {
//			System.out.print(x + " ");
//			}
//			x++;
//			
//		}
		
//		boolean workDay = true;
//		int day = 1;
//		if (day<6) {
//			while (day<6) {
//				System.out.println("I need a day off");
//				day++;
//			}
//			System.out.println("I do not need a day off any more");
//		}
		
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i<=5) {
			System.out.println("Enter your name");
			String name = scan.nextLine();
			i++;
		}
		
		

	}

}
