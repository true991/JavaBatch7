package com.syntax.class05;

public class Repl {
	public static void main(String[] args) {

		String[][] food = { { "borsch", "pelmeny", "bliny", "kotlety" }, { "burger", "sandwich", "fries", "KFC" },
				{ "pasta", "pizza", "lazagnia" }, { "shawurma", "hot-dog", "doner", "kebab" } };

//			NESTED FOR LOOP
		for (int i = 0; i < food.length; i++) {
			for (int k = 0; k < food[i].length; k++) {
				String each = food[i][k];
				System.out.print(each + "  ");
			}
			System.out.println();
		}

		System.out.println("=================================================");

//		 	ENCHANCE FOR LOOP

		for (String[] array : food) {
			for (String kind : array) {
				System.out.print(kind + " ");
			}
			System.out.println();
		}

		System.out.println("=================================================");

		int[][] nums = { { 10, 23, 56, 47 }, { 33, 668, 89 }, { 1, 9, 0 }, };

		int sum = 0;

		for (int j = 0; j < nums.length; j++) {
			for (int k = 0; k < nums[j].length; k++) {
				if (nums[j][k] % 2 != 0) {
					sum += nums[j][k];
				}
			}
		}
		System.out.println(sum);

		System.out.println("=================================================");

		sum = 0;
		for (int[] array : nums) {
			for (int i : array) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);

	}
}
