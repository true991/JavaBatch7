package com.syntax.class02;

public class Compound {
	public static void main(String[] args) {
		int num = 100;
		num = num + 100;
		System.out.println(num);

		num += 100; // num = num + 100

		System.out.println(num);

		num -= 50;  // num = num - 50
		System.out.println(num);

		num *= 2;   // num = num * 2
		System.out.println(num);
		
		num /= 5;   // num = num / 5
		System.out.println(num);
		
		num %= 30;  // num = num % 30;
		System.out.println(num);

	}

}
