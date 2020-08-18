package com.syntax.class12;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {

		System.out.println("===== 1st =====");

		Set<String> countries = new TreeSet<>();

		countries.add("US");
		countries.add("Russia");
		countries.add("Ukraine");
		countries.add("Mexico");
		countries.add("GBR");

		System.out.println("===== for Each =====");

		for (String land : countries) {
			System.out.println(land);
		}

		System.out.println("===== Iterator =====");

		Iterator<String> it1 = countries.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("===== 2nd =====");

		Set<String> cities = new LinkedHashSet<>();

		cities.add("Anapolis");
		cities.add("Miami");
		cities.add("New York");
		cities.add("Atlanta");
		cities.add("Chicago");
		cities.add("Sacramento");

		System.out.println("Before Iterator -----> " + cities);

		Iterator<String> it2 = cities.iterator();
		while (it2.hasNext()) {
			String x = it2.next();
			if (x.startsWith("A")) {
				it2.remove();
			}
		}

		System.out.println("After Iterator -----> " + cities);

		System.out.println("===== 3rd =====");

		Set<Student> batch = new LinkedHashSet<>();
		Student a = new Student("Ivan", 10001);
		Student b = new Student("Igor", 10002);
		Student c = new Student("John", 10003);
		Student d = new Student("Jack", 10004);
		Student e = new Student("Erik", 10005);

		batch.add(a);
		batch.add(b);
		batch.add(c);
		batch.add(d);
		batch.add(e);

		for (Student student : batch) {
			System.out.println("Name is : " + student.returnName());
		}

	}

}

class Student {
	public String name;
	public int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String returnName() {
		return name;
	}
}
