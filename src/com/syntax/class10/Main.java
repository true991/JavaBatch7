package com.syntax.class10;

class Main {
	
	
	public static final double avgElements(int[] arr) {
		
		double a = 0;
		
		for(double b : arr) {
			a += b;
		}
		double x = a/ arr.length;
		return x;
	}

	
	
	
	
	
	public static void main(String[] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}

}