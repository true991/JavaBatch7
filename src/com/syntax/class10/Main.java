package com.syntax.class10;

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		ArrayList<Integer> prime = new ArrayList<>();

		int factor = 0;

		for (int i = 2; i < 101; i++) {

			factor = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					factor++;

				}

			}

			if (factor == 2) {

				prime.add(i);
			}

		}

		System.out.println(prime);

	}
}
