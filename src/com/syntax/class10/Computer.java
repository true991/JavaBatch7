package com.syntax.class10;

public class Computer {

	String name;
	int year;

	Computer(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public void batteryLife() {
		System.out.println(this.name + ": " + "Battery life is 4 hours");
	}

	public void displaySize() {
		System.out.println(this.name + ": " + "Display is 13 inches");
	}

	public void laptop() {
		System.out.println(this.name + ": " + "Current computer is laptop");
	}
}

class Apple extends Computer {

	Apple(String name, int year) {
		super(name, year);
	}

	public void batteryLife() {
		System.out.println(super.name + ": " + "Battery life is 8 hours");
	}

	public void displaySize() {
		System.out.println(super.name + ": " + "Display is 16 inches");
	}

	public void retina() {
		System.out.println(super.name + ": " + "Apple laptops has retina display");
	}

}

class Lenovo extends Computer {

	Lenovo(String name, int year) {
		super(name, year);
	}

	public void laptop() {
		System.out.println(super.name + ": " + "Current computer is NOT laptop");
	}

}

class HP extends Computer {

	HP(String name, int year) {
		super(name, year);
	}

	public void displaySize() {
		System.out.println(super.name + ": " + "Display is 15 inches");
	}

}

class Dell extends Computer {

	Dell(String name, int year) {
		super(name, year);
	}

	public void displaySize() {
		System.out.println(super.name + ": " + "Display is 21 inches");
	}

	public void laptop() {
		System.out.println(super.name + ": " + "Current computer is NOT laptop");
	}

}
