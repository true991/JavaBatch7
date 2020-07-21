package com.syntax.class10;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard a = new CreditCard();
		int x = a.calc(4000);
		System.out.println(x);

		Visa b = new Visa();
		int y = b.calc(300);
		System.out.println(y);

		AX c = new AX();
		int z = c.calc(900);
		System.out.println(z);

	}
}
