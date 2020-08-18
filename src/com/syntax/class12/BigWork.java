package com.syntax.class12;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BigWork {
	public static void main(String[] args) {

		System.out.println("========= ONE =========");

		Map<Integer, String> bb = new LinkedHashMap<>();
		bb.put(1284849, "Printer");
		bb.put(3243432, "Phone");
		bb.put(1233567, "TV");
		bb.put(1786755, "Laptop");
		bb.put(2345662, "Headphones");

		Set<Entry<Integer, String>> items = bb.entrySet();

		for (Entry<Integer, String> one : items) {

			System.out.println(one.getKey() + " --> " + one.getValue());

		}

		System.out.println("========= TWO =========");

		String[] cities = { "Omsk", "Novosibirsk", "Tomsk", "Moscow", "Sochi", "Ekaterinburg", "Irkutsk", "Rostov",	"Abakan" };

		Map<String, Integer> lands = new TreeMap<>();

		for (String x : cities) {
			if (x.length() < 8) {
				lands.put(x, x.length());
			}
		}

		System.out.println(lands);

		System.out.println("========= THREE =========");

		Map<String, Double> corp = new LinkedHashMap<>();
		corp.put("Ivan", 80000.00);
		corp.put("Alex", 100000.00);
		corp.put("Maria", 90000.00);
		corp.put("Petr", 65000.00);
		corp.put("Daria", 77000.00);
		corp.put("Elena", 95000.00);
		corp.put("Maxim", 99000.00);
		
		

		Set<String> body = corp.keySet();

		String name = "";
		double check = 0;

		for (String x : body) {
			if (corp.get(x) > check) {
				name = x;
				check = corp.get(x);
			}
		}

		System.out.println(name + "=$" + check);

		System.out.println("========= FOUR =========");

		Set<String> any = new LinkedHashSet<>();
		any.add("Monday");
		any.add("Tuesday");
		any.add("Wednesday");
		any.add("Thursday");
		any.add("Friday");
		any.add("Saturday");
		any.add("Sunday");

		String total = "";

		for (String string : any) {

			total += string;
		}

		System.out.println("Cancatenation of all strings is : " + total);

		System.out.println("========= FIVE =========");

		List<Integer> summary = new LinkedList<>();

		summary.add(100);
		summary.add(200);
		summary.add(300);
		summary.add(400);
		summary.add(500);
		summary.add(400);
		summary.add(300);
		summary.add(200);
		summary.add(100);

		int sum = 0;

		for (Integer x : summary) {
			sum += x;
		}

		System.out.println("Total of numbers is : " + sum);

	}

}
