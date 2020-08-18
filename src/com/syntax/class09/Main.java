package com.syntax.class09;

public class Main {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 3, 5, 7 } };

		int[][] b = Main.arr(a);

		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < b[i].length; k++) {
				System.out.print(b[i][k] + " ");
			}
			System.out.println();
		}

	}

	static int[][] arr(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				array[i][k] -= 10;
			}

		}

		return array;
	}

}