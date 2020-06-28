package com.syntax.class03;

public class NestedIf {
	public static void main (String [] args) {
		
		boolean isMorning = true;
		boolean isSchool = true;
		int time = 20;
		
		if (isMorning) {
			System.out.println("Good Morning");
			
			if (isSchool) {
			System.out.println("Friends");
			} else {
			System.out.println("Family");
			}
			System.out.println("Bye");
			
		} else {
			System.out.println("It is not morning");
			
			if (time<18) {
			System.out.println("Good Afternoon");
			} else {
				System.out.println("Good Evening");
			}
		}
		System.out.println("She has no questions");	
	}
			
}


