package com.syntax.class02;

public class Modules {
	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double result = d1 / d2;
		System.out.println(result);
		
		float f1 = 12.5f;
		float f2 = 4.7f;
		float floatResult = f1/f2;
		System.out.println(floatResult);

		int i = 14;
		int j = 4;
		int result2 = i / j;
		double result3 = i / j;
		System.out.println(result2);
		System.out.println(result3);

		int mod = i % j;
		System.out.println("The remainder is " + mod);

		double num1 = 14;
		double num2 = 4;
		double div = num1 / num2;
		double mod2 = num1 % num2;
		System.out.println("If we divide doubles the result is " + div);
		System.out.println(mod2);

		i = 17;
		j = 4;
		mod = i % j;
		System.out.println(mod);

	}

}
