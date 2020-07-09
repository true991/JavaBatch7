package com.syntax.slass08;

public class ArrayManipulation {

	public int largest(int[] array) {
		int x = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > x) {
				x = array[i];
			}
		}
		return x;
	}

	public int smallest(int[] array) {
		int x = array[0];

		for (int y : array) {
			if (y < x) {
				x = y;
			}
		}
		return x;
	}
	
	public static void printSum(int [] array) {
		int total = 0;
		
			for(int element : array) {
				total += element;
			}
		
		System.out.println("Total is: " + total);
		
	}
	
	public static int returnSum(int [] array) {
		int total = 0;
		
			for(int element : array) {
				total += element;
			}
		
		return total;
		
	}
	
	public static void printArray(int [] array) {
		for(int element : array) {
			
			System.out.print(element + "; ");
		}
		
			System.out.println();
	}
	
	

	
	
	
}
