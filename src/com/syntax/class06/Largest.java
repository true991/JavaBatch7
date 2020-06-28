package com.syntax.class06;

public class Largest {

	public static void main(String[] args) {
		int [] numbers1 = {30, 20, 40, 50 ,600};
		
		int largest = 0;
		
		for (int num1 : numbers1) {
			if (num1>largest) {
				largest = num1;
			}
		}
		System.out.println(largest);
		
		int [] numbers2 = {22, -45, -55, -74, -8, -93, -44};
		
		int smaller = numbers2[0];
		
		for(int num2 : numbers2) {
			if(num2<smaller) {
				smaller = num2;
			}
		}
		System.out.println(smaller);

	}

}
