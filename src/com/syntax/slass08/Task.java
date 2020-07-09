package com.syntax.slass08;

public class Task {
	
	public static void main(String[] args) {
		
		Employee first = new Employee();
		Employee second = new Employee();
		
		first.eID = 10091;
		first.salary = 100000;
		
		second.eID = 10092;
		second.salary = 120000;
		
		first.display();
		second.display();
		
	}

}
