package com.syntax.class06;

public class SundayClass {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		for (int k = 0; k < grades.length; k++) {
			System.out.print(grades[k] + ", ");
		}
		System.out.println();

		for (char element : grades) {
			System.out.print(element + " ");
		}

		System.out.println("=========================");

		String[] fruits = { "Apple", "Orange", "Cucumber", "Banana", "Grapes" };

		// 1st way

		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " - ");
		}
		System.out.println();
		
		//2nd way
		
		for (String items : fruits) {
			System.out.print(items + " / ");
		}
	}

}
