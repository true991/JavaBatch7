package com.syntax.class03;

public class IfStatement {
	public static void main(String[] args) {
		int temp = 50;
		if (temp > 95) {
			System.out.println("It's very hot");
		} else if (temp > 70) {
			System.out.println("It is hot");
		} else if (temp > 40) {
			System.out.println("It is normal");
		} else if (temp > -40) {
			System.out.println("It is cold");
		} else {
			System.out.println("It is Siberia");
		}
		
		int i = 0;
		int remainder = i % 2;
		if (remainder == 0) {
			System.out.println("Number is even");
		}  else if (remainder == 1) {
			System.out.println("Number is odd");
		
		
		}
		
	}

}
