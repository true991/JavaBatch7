package com.syntax.class08;

public class Cat {

	
	
	
	
	
	public static void main(String[] args) {

		StaticVoid cat1 = new StaticVoid();
		cat1.name = "Sandro";
		cat1.color = "Red";
		cat1.age = 6;
		
		
		// call static variable using *classname.static variables name*
		System.out.println(StaticVoid.paws);

		StaticVoid cat2 = new StaticVoid();
		cat2.name = "Kiss";
		cat2.color = "Black";
		cat2.age = 3;
		//cat2.mustache = false;   // re-assigning static variable, but NOT right way
		StaticVoid.tail = false;   // re-assigning RIGHT way

		
		cat1.display();
	
		cat2.display();
		
		
		
		
		
		

	}

}
