package com.syntax.class11;

import java.util.Iterator;
import java.util.LinkedList;

class CreditCard {

	String type;

	public void deposit() {
		System.out.println("Deposit up to 40 bills");

	}

	public void withdraw() {

	}

	CreditCard(String type) {
		this.type = type;
	}

}

class First extends CreditCard {

	First(String type) {
		super(type);
	}

	public void withdraw() {
		System.out.println("Only $20 bills avaliable for " + type);
	}

}

class Second extends CreditCard {

	Second(String type) {
		super(type);
	}

	public void withdraw() {
		System.out.println("Only $50 bills avaliable for " + type);
	}

}

class Third extends CreditCard {

	Third(String type) {
		super(type);
	}

	public void withdraw() {
		System.out.println("Only $100 bills avaliable for " + type);
	}

}

public class Card {
	public static void main(String[] args) {
		CreditCard a = new First("VISA");
		CreditCard b = new Second("Master Card");
		CreditCard c = new Third("MIR");

		LinkedList<CreditCard> cards = new LinkedList<>();
		cards.add(a);
		cards.add(b);
		cards.add(c);

		System.out.println("----- FOR LOOP -----");

		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).deposit();
			cards.get(i).withdraw();
			System.out.println("====>");
		}

		System.out.println("----- FOR EACH -----");

		for (CreditCard x : cards) {
			x.deposit();
			x.withdraw();
			System.out.println("====>");
		}

		System.out.println("----- ITERATOR -----");

		Iterator<CreditCard> it = cards.iterator();

		while (it.hasNext()) {
			CreditCard s = it.next();
			s.deposit();
			s.withdraw();
			System.out.println("====>");

		}

	}
}
