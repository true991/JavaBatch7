package com.syntax.class12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {

		System.out.println("===== HashSet =====");
		HashSet<String> brand = new HashSet<>();

		brand.add("Nike");
		brand.add("Adidas");
		brand.add("Puma");
		brand.add("Zara");
		brand.add("H&M");
		brand.add("Nike"); // NO duplicate

		System.out.println(brand.size() + " ---> " + brand);

		boolean isThere = brand.contains("Nike");
		System.out.println(isThere);

		System.out.println("===== Iterator =====");

		Iterator<String> it = brand.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("===== for Each =====");

		for (String x : brand) {
			System.out.println(x);
		}

		System.out.println("===== LinkedHashSet =====");

		LinkedHashSet<String> lux = new LinkedHashSet<>();
		lux.add("Gucci");
		lux.add("Prada");
		lux.add("Boss");
		lux.add("LV");
		lux.add("Chanel");
		lux.add("LV");
		lux.add("Prada"); // NO duplicates

		System.out.println(lux.size() + " ---> " + lux);

		System.out.println("===== TreeSet =====");

		TreeSet<String> allBrand = new TreeSet<>(brand);

		System.out.println(allBrand.size() + " ---> " + allBrand);
		allBrand.add("Stone Island");
		allBrand.addAll(lux);
		System.out.println("===== for Each =====");
	

		for (String yolo : allBrand) {
			System.out.println(yolo);

		}
		
		System.out.println("===== Iterator =====");
		
		Iterator <String> all = allBrand.iterator();
		
		while(all.hasNext()) {
			System.out.println(" - " + all.next());
		}
		
		

	}

}
