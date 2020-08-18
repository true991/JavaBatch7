package com.syntax.class12;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
	public static void main(String[] args) {

		Map<Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "Mazda");
		floors.put(2, "Audi");
		floors.put(3, "Benz");
		floors.put(4, "Porsche");
		floors.put(5, "Toyota");
		floors.put(6, "BMW");
		floors.put(7, "Honda");
		floors.put(8, "KIA");
		floors.put(9, "Lamborghini");
		floors.put(10, "Ferrari");

		System.out.println("Orogonal map : " + floors);

		System.out.println("Size is :" + floors.size());

		System.out.println("========");

		Set<Integer> keys = floors.keySet();

		for (Integer x : keys) {

			System.out.println(x + " --> " + floors.get(x));
		}

		System.out.println("========");

		Iterator<Integer> it1 = keys.iterator();

		while (it1.hasNext()) {
			int x = it1.next();
			System.out.println(x + " --> " + floors.get(x));
		}
		
		System.out.println("========");
		
		Collection<String> values = floors.values();
		
		for(String x : values) {
			System.out.println(x);
		}
		
		Iterator <String> it2 = floors.values().iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		

	}

}
