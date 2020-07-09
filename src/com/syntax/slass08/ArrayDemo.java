package com.syntax.slass08;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = {5,9,20,14,-90};
		
		int [] too = {23,54,66,443,234,54,3};
		
		ArrayManipulation qwe = new ArrayManipulation();
		
		int biggest = qwe.largest(arr);
		System.out.println(biggest);
		
		int small = qwe.smallest(too);
		System.out.println(small);
		
		ArrayManipulation.printSum(too);
		
		int sum = ArrayManipulation.returnSum(arr);
		System.out.println(sum);
		
		ArrayManipulation.printArray(too);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
