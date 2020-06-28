package com.syntax.class02;

public class StringDemo {
	public static void main(String[] args) {
		
		String name = "Car";
		
		String brand = "Porsche";
		
		String color = "Red";
		
		String year = "2020";
		
		String price = "100k USD";
		
		/*System.out.println(name);
		System.out.println(brand);
		System.out.println(color);
		System.out.println(year);
		System.out.println(price);
		
		color = "White";
		
		System.out.println(color);
		
		System.out.println("I love my " + color + brand);
		*/
		
		String tag = "Alex";
			
		if (tag.equals("Alex")) {
			System.out.println("User logged in as Alex");			
		} else if (tag.equals("Malika")) {
			System.out.println("User logged in as Malika");
		} else if (tag.equals("Ummar")) {
			System.out.println("User logged in as Ummar");
		} else {
			System.out.println("Unknown User");
		}
		boolean isAlex = tag.equals("Alex");
		System.out.println(isAlex);
				
		
				
		
		
		
		
	}

}
