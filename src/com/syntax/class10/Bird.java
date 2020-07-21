package com.syntax.class10;

public class Bird {
	
	public void fly() {
		System.out.println("bird is flying");
	}
	public void eat() {
		System.out.println("bird is eating");
	}
	public void sleep() {
		System.out.println("bird is sleeping");
	}
}

class BabyBird extends Bird {
	
	@Override
	public void fly() {
		System.out.println("Fly Overr");
	}
	
	public void cry() {
		System.out.println("BAbybird is crying");
	}
}
