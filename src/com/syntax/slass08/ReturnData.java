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

	// will return the true if an int is over 100
	boolean overHundred(int a) {
		if (a > 100) {
			return true;
		} else {
			return false;
		}
	}

	// will return upper case string
	String upper(String a) {
		return a.toUpperCase();
	}

	String eMail(String name, String lastName, String type) {
		return (name + lastName + "@" + type).toLowerCase();
	}

	Boolean isPrime(int a) {
		if (a > 3) {
			if (a % 2 != 0 && a % 3 != 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	Boolean isPrimeToo(int a) {
		boolean prime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;

	}

	char grade(int a) {
		if (a > 50 && a <= 70) {
			return 'D';
		} else if (a > 70 && a <= 80) {
			return 'C';
		} else if (a > 80 && a <= 90) {
			return 'B';
		} else if (a > 90) {
			return 'A';
		} else {
			return 'F';
		}

	}

	int largestFromArray(int[] array) {
		int a = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= a) {
				a = array[i];
			}
		}
		return a;

	}
	
	String [] getArray (String name) {
		return name.split(" ");		
	}
	
	
	

}
