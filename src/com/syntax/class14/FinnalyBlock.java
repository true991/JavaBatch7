package com.syntax.class14;

public class FinnalyBlock {

	public static void main(String[] args) {

		String str = "Java";

		try {
			System.out.println("Imma try");
			char letter = str.charAt(11);
			System.out.println(letter);
		}  finally {
			System.out.println("Imma finally");
		}

		System.out.println("Imma end of code");
		
	

	}

}
