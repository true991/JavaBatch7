package com.syntax.class04;

import java.util.Scanner;

public class SwitchIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = scan.nextLine();
		String lang;
		
		switch (country.toLowerCase()) {
		case "us":
		case "england":
		case "australia":	
			lang = "English";
			break;
		case "spain":
		case "mexico":
			lang = "Spanish";
			break;
		case "russia":
		case "ukraine":
		case "belarussia":	
			lang = "Russian";
			break;
		case "germany":
		case "austria":	
			lang = "Deutch";
			break;
		case "china":
			lang = "Chinesse";
			break;
		case "syntax":
			lang = "JAVA";
			break;
		default:
			lang = "Unknown";		
		}
		System.out.println("You speak " + lang);
	}
}
