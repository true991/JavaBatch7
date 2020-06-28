package com.syntax.class06;

public class Patterns {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 4; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=====================");

		for (int y = 5; y >= 1; y--) {
			for (int r = 1; r <= y; r++) {
				System.out.print(y + "");
			}
			System.out.println();
		}

		System.out.println("=====================");

		for (int u = 5; u > 0; u--) {
			for (int g = u; g > 0; g--) {
				System.out.print(g + "");
			}
			System.out.println();
		}

		System.out.println("=====================");

		for (int m = 1; m <= 4; m++) {
			for (int p = m; p >= 1; p--) {
				System.out.print(p + "");
			}
			System.out.println();
		}
		for (int u = 5; u > 0; u--) {
			for (int g = u; g > 0; g--) {
				System.out.print(g + "");
			}
			System.out.println();
		}

		System.out.println("=====================");

	}
}
