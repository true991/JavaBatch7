package com.syntax.class11;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {

		System.out.println("----- 1st -----");

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("Soda");
		drinks.add("Cola");
		drinks.add("Wisky");
		drinks.add("Rum");
		drinks.add("Tea");
		drinks.add("Red Bull");
		drinks.add("Kabucha");

		System.out.println(drinks);

		for (int i = 0; i < drinks.size(); i++) {
			String a = drinks.get(i);
			if (a.contains("a") || a.contains("e")) {
				drinks.set(i, "Water");
			}
		}

		System.out.println(drinks);

		System.out.println("----- 2nd -----");

		ArrayList<Integer> even = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even.add(i);
			}
		}

		System.out.println(even);

		Iterator<Integer> it = even.iterator();

		while (it.hasNext()) {
			if (it.next() % 5 == 0) {

				it.remove();

			}
		}

		System.out.println(even);
		
		

	}

}
