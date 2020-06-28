package com.syntax.class07;

public class Phone {
	String make;
	String model;
	String camera;
	int price;
	
	
	void call() {
		System.out.println(make + " might call");
	}
	
	void photo () {
		System.out.println(make + " can take a photo");
		
	}
	
	void music () {
		System.out.println("You can listening music on your " + make);
	}
 
}
