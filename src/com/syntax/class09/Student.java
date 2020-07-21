package com.syntax.class09;

public class Student {
	
	public String name, adress;
	
	Student(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}
	
	
	void info () {
		System.out.println(this.name + " " + this.adress);
	}
	
	
	
	public static void main(String[] args) {
		
		Student x = new Student("RHPAEP", "XATA");
		
		x.info();
		
		
	}

}
