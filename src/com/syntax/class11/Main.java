package com.syntax.class11;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Insurance {

	String insuranceName;

	abstract public void getQuote();

	abstract public boolean cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	public void getQuote() {

		System.out.println("CarQuote");

	}

	public boolean cancelInsurance() {

		return true;

	}

}

class Pet extends Insurance {

	String petType;

	public void getQuote() {

		System.out.println("PetQuote");

	}

	public boolean cancelInsurance() {

		return true;

	}

}

class Health extends Insurance {

	public void getQuote() {
		System.out.println("HealthQuote");
	}

	public boolean cancelInsurance() {

		return false;

	}
}

public class Main {
	public static void main(String[] args) {

		Pet a = new Pet();

		Car b = new Car();

		Health c = new Health();

		ArrayList<Insurance> arr = new ArrayList<>();

		arr.add(a);
		arr.add(b);
		arr.add(c);

		System.out.println("====== for ======");

		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).getQuote();
			System.out.println(arr.get(i).cancelInsurance());
			System.out.println("---");
		}

		System.out.println("====== for each ======");

		for (Insurance x : arr) {

			x.getQuote();
			System.out.println(x.cancelInsurance());
			System.out.println("---");
		}

		System.out.println("====== Iterator ======");

		Iterator<Insurance> it = arr.iterator();

		while (it.hasNext()) {
			Insurance y = it.next();
			y.getQuote();
			System.out.println(y.cancelInsurance());
			System.out.println("---");

		}

	}
}
