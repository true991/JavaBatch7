package com.syntax.class06;

public class TwoDimensionalArray2D {
	public static void main(String[] args) {

		int[][] numbers = new int[3][4]; // [rows] [columns]

		// 1st row
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;

		// 2nd row
		numbers[1][0] = 30;
		numbers[1][1] = 35;
		numbers[1][2] = 40;
		numbers[1][3] = 45;

		// 3rd row
		numbers[2][0] = 50;
		numbers[2][1] = 55;
		numbers[2][2] = 60;
		numbers[2][3] = 65;

		System.out.println(numbers[2][1]);

		int[][] digits = { 
				{ 1, 11, 111, 1111 }, 
				{ 2, 22, 222, 2222 }, 
				{ 3, 33, 333, 3333 } 
				};
		
		System.out.println(digits[2][2]);
		System.out.println(digits[1][3]);

	}
}
