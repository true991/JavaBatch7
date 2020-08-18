package com.syntax.class12;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Task2 {
	static void display(Map<String, Integer> map) {
		Set<Entry<String, Integer>> mapSet = map.entrySet();
		if (map.isEmpty()) {
			System.out.println("map is empty");
		} else {
			for (Entry<String, Integer> set : mapSet) {
				System.out.println(set.getKey() + " : " + set.getValue());
			}
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10);
		map.put("apple", 30);
		map.put("orange", 20);
		display(map);
		map.clear();
		display(map);
	}
}