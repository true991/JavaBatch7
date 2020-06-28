package com.syntax.class02;

public class RelationalOperators {
	public static void main(String[] args) {

		double i = 10.55;
		double j = 10.55;

		boolean result1 = i > j;

		boolean result2 = i < j;

		boolean result3 = i == j;

		boolean result4 = i != j;

		boolean result5 = i >= j;

		boolean result6 = i <= j;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

		int num = 78;
		boolean result = num > 100;
		System.out.println("More than 100?");
		if (num > 100) {
			System.out.println("My number is large");
		} 
		else {
			System.out.println("Obviously not");
		}

		System.out.println("Complete");
	}

}
