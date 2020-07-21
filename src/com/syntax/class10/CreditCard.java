package com.syntax.class10;

public class CreditCard {
	public double balance;
	public int interest;

	public int calc(double balance) {
		this.balance = balance;
		if (balance < 1000) {
			this.interest = 4;
		} else {
			this.interest = 8;
		}
		return this.interest;
	}

}

class Visa extends CreditCard {
	
}

class AX extends CreditCard {
	
	@Override
	public int calc(double balance) {
		this.balance = balance;
		if (balance < 800) {
			this.interest = 3;
		} else {
			this.interest = 6;
		}
		return this.interest;
	}
	
}


