package com.syntax.class11;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {
	public static void main(String[] args) {
		
		ArrayList<Double> nums = new ArrayList<>();
		
		nums.add(10.99);
		nums.add(6.99);
		nums.add(7.99);
		nums.add(5.99);
		nums.add(7.99);
		nums.add(8.99);
		
		System.out.println(nums);
		
				
		System.out.println("==== for loop ====");
		
		for(Double x : nums) {
			
			
			System.out.print(x + " ");
			
		}
		
		System.out.println();
		
		
		System.out.println("==== backward for loop ====");
		
		for(int i = nums.size()-1; i>=0; i--) {
			System.out.println(nums.get(i));
		}
		
		Iterator <Double> it = nums.iterator();
		
		
		
		System.out.println("==== Iterator ====");
		
		//next(); ----> gets next Object
		//hasNext(); -> check if there is next element
		//remove(); --> remove element from collection
		
		while(it.hasNext()) {
			if(it.next() < 10) {
				it.remove();
			}
		}
		
		System.out.println(nums);
		
		
		
		


	
	
	}
}
