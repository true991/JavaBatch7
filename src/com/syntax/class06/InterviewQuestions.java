package com.syntax.class06;

public class InterviewQuestions {

	public static void main(String[] args) {
//		Write a program to swap 2 numbers without a temporary variable?

//		Write a java program to check whether a given number is prime or not?

//		Write a Java Program to print the first 10 numbers of Fibonacci series.

		int[] fib = new int[10];
		
		int x = 0;

//??????		for (int i = 0; i<fib.length; i++) {
//			if (i > 1) {
//				x[i] = x[i - 1] + x[i - 2];
//			}
//		}
//		Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int[] nums = { 23, 55, 44, 36, 13, 567, 432, 32, 89 };

		int a = 0;
		int b = 0;

		for (int i : nums) {
			if (i > a) {
				a = i;
			}
		}
		for (int i : nums) {
			if (i > b && i < a) {
				b = i;
			}
		}
		System.out.println(b);

	}

}
