package com.syntax.class07;

public class StringMethods {
	public static void main(String [] args) {
		String name = "Olga"; // literal
		
		//or
		
		String name1 = new String();
		
		System.out.println(name + name1);
		
		
		//methods of String class
		String school = "Syntax";
		String greetings = "Hello Syntax";
		
		System.out.println("--------------.length() method -------------------");
		
		//Count of characters includes in String;
		int size1 = school.length();
		System.out.println(size1);
		
		int size2 = greetings.length();
		System.out.println(size2); // space is character too
		
		System.out.println("--------------.toUpperCase() method --------------");
		
		String city = "Washington DC";
		String newCity = city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("--------------.toLowerCase() method --------------");
		
		String lowerCity = newCity.toLowerCase();
		System.out.println(lowerCity);
		
		System.out.println("--------------.concat() method -------------------");
		
		String country = "USA";
		String capital = "Washington DC";
		System.out.println(country.concat(capital)); // work only if both values are Strings
		
		System.out.println("--------------.isEmpty() method ------------------");
		
		String str = "Hello";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty); //if string is empty its going to be true, and false of opposite
		
		System.out.println("--------------.trim() method ---------------------");
		
		String cat = "Jessy";
		String dog = "  Charly  ";
		System.out.println(cat);
		System.out.println(dog);
		System.out.println(cat.trim());
		System.out.println(dog.trim()); // cut spaces at the start and at the end only
		
		System.out.println("--------------.contains() method ------------------");
		
		String str1 = "Good afternoon all";
		String searchValue = "afternoon";
		boolean contains = str1.contains(searchValue);
		System.out.println(contains);
		boolean contains1 = str1.contains("after");
		System.out.println(contains1);
		
		System.out.println("--------------.startWith() method ------------------");
		System.out.println("--------------.endWith()   method ------------------");
		
		String drink = "water";
		boolean start = drink.startsWith("w");
		boolean end = drink.endsWith("a");
		System.out.println(start + "; " + end +"; ");
		
		System.out.println("--------------.equals() method ------------------");
		
		String s1 = "Saturday";
		String s2 = "saturday";
		String s3 = "Sunday";
		boolean eq1 = s1.equals(s2);
		boolean eq2 = s1.equalsIgnoreCase(s2);
		boolean eq3 = s2.equals(s3);
		System.out.println(eq1);
		System.out.println(eq2);
		System.out.println(eq3);
		
		System.out.println("--------------.charAt() method ------------------");
		
		String season = "Summer";
		char ch = season.charAt(3);
		System.out.println(ch);
		
		System.out.println("--------------.indexOf() method ------------------");
		
		int index = season.indexOf('m');
		System.out.println(index);
		
		System.out.println("--------------.substring() method ------------------");
		
		String message = "You guys are awesome";
		System.out.println(message.substring(4));
		System.out.println(message.substring(9, 12));
		
		
		
		
		
		
		
		


		
		
		
		
		
		
	}

}
