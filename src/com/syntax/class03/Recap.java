package com.syntax.class03;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a integer!");
		int i = scan.nextInt();
		System.out.println(i);
		
		System.out.println("Enter a double!");
		double d = scan.nextDouble();
		System.out.println(d);
		
		System.out.println("Enter boolean");
		boolean b = scan.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter Char");
		char c = scan.next().charAt(0);
		System.out.println(c);
		
		
		
		
	}

}
