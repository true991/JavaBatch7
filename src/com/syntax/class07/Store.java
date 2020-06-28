package com.syntax.class07;

public class Store {
	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.make = "Apple";
		iPhone.model = "XS";
		iPhone.camera = "12mp";
		iPhone.price = 999;
		
		iPhone.call();
		iPhone.photo();
		iPhone.music();
		
		System.out.println("====================================");
		
		Phone Android = new Phone();
		Android.make = "Samsung";
		Android.model = "Galaxy";
		Android.camera = "16mp";
		Android.price = 899;
		
		Android.call();
		Android.photo();
		Android.music();
		
		System.out.println("====================================");

		Phone Nokia = new Phone();
		Nokia.make = "Nokia";
		Nokia.model = "7210i";
		Nokia.camera = "1.3mp";
		Nokia.price = 49;
		
		Nokia.call();
		Nokia.photo();
		Nokia.music();
		
		
		
	}

}
