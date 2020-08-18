package com.syntax.class12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {
	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<>();

		// to store using .put method

		hmap.put(10, "John");
		hmap.put(11, "James");
		hmap.put(12, "John");
		hmap.put(13, "Joahn");
		hmap.put(14, "Jack");

		System.out.println(hmap);

		System.out.println(hmap.size());
		System.out.println(hmap.isEmpty());
		System.out.println(hmap.containsKey(13));
		System.out.println(hmap.containsValue("John"));
		
		System.out.println("=========   no order   ==========");
		
		Map <String, Double> map = new HashMap<>();
		map.put("Apple", 90.09);
		map.put("Milky", 70.69);
		map.put("Bread", 20.59);
		map.put("Juice", 10.89);
		map.put("Water", 60.79);
		
		System.out.println(map);
		
		System.out.println("=========   order as assigning order   ==========");
		
		Map <String, Double> mall = new LinkedHashMap<>();
		
		mall.put("Cologne", 99.99);
		mall.put("Choes", 89.99);
		mall.put("T-Shirt", 19.99);
		mall.put("Cologne", 99.99);
		mall.put("Tea", 3.99);
		
		System.out.println(mall);
		
		System.out.println("=========   ABC order   ==========");
		
		Map <String, Double> cart = new TreeMap<>();
		
		cart.putAll(map);
		cart.putAll(mall);
		
		System.out.println(cart);
		
		Map <String, Double> htable = new Hashtable<>();
		
		htable.put("House", 600000.00);
		htable.put("Car", 60000.00);
		htable.put("Phone", 1000.00);
		htable.put("Food", 100.00);
		
		
		
		
		
		
		
	}

}
