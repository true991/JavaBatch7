	package com.syntax.class09;

public class Book {
	
	String title;
	int pages;
	
	
	Book() {
		
		System.out.println("NON");
	}
	
	Book(String title, int pages) {
		this();
		this.title = title;
		this.pages = pages;
	}
	
	
	public void info () {
		System.out.println("The title is " + title + " and size is " + pages + " pages");
	}
	
	
	public static void main(String[] args) {
		Book x = new Book();
		x.title = "Lord of the Rings";
		x.pages = 2000;
		
		Book y = new Book("Harry Potter", 900);
		
		x.info();
		y.info();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
