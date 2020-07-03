package com.syntax.slass08;

public class ReturnData {

	// method that will accept if an int is even

	boolean isEven(int a) {
		boolean even;
		if (a % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;
	}

	// method that will return the largest number

	int isLarger(int a, int b) {
		int largest;

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;

	}

	boolean overHundred(int a) {
		if (a > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	String upper (String a) {
		return a.toUpperCase();
	}

}
