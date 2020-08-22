package com.syntax.class14;

public class ExceptionIntro {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (Exception ae) {
			System.out.println("Catch it! ArithmeticException !");
			
		}
		
		System.out.println("Continue the code");
		
	}

}
