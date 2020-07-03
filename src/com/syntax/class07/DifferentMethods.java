package com.syntax.class07;

public class DifferentMethods {

	// lets create methods that says hello any number of times

	void sayHello(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}

	// create that will print any word any number of times
	void printAnyWord(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(word);
		}
	}
	
	void isHungry(boolean a) {
		if (a) {
			System.out.println("Go cook");
		} else {
			System.out.println("Go study");
		}
	}

}
