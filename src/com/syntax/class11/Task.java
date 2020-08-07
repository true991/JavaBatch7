package com.syntax.class11;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		
		
		ArrayList <String> cars = new ArrayList<>();
		
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Benz");
		cars.add("VW");
		
		System.out.println("----- 1st -----");
		
		for(int i = 0; i<cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("----- 2nd -----");
		
		for(String x : cars) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("----- 3rd -----");
		
		Iterator <String> it = cars.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		
		System.out.println("------ ends With ------");
		
		
		ArrayList <String> words = new ArrayList<>();
		
		words.add("Coffee");
		words.add("Tea");
		words.add("Ale");
		words.add("Coke");
		words.add("Water");
		words.add("Soda");
		
		System.out.println("Before iterator: " + words);
		
		Iterator <String> it1 = words.iterator();
		
		while(it1.hasNext()) {
			String drink = it1.next();
			if(drink.endsWith("e")) {
				it1.remove();
			}
		}
		
		System.out.println("After iterator: " + words);
		
		
				
		
		
		


		
	}

}
