package com.syntax.class02;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = num1;
		System.out.println(num3);

		int sum = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int mult = num1 * num2;

		System.out.println("Addition -> " + sum);
		System.out.println("Substraction -> " + sub);
		System.out.println("Division -> " + div);
		System.out.println("Multiplication -> " + mult);

		double d1 = 3.4;
		double d2 = 7.15;
		double dSum = d1 + d2;
		System.out.println(dSum);
		double dSum2 = num1 + num2;
		System.out.println(dSum2);

		System.out.println("Ahmet" + 10 + 30);
		System.out.println("Ahmet" + (10 + 30));
		System.out.println("Ahmet" + 10 * 30);

	}

}
