package com.syntax.class10;

public class MethodOverload {

	// 1. by changing NUMBER of parms
	public int sum(int a, int b) {

		return a + b;
	}

	public int sum(int a, int b, int c) {

		return a + b + c;
	}

	public double sum(double a, double b) {

		return a + b;
	}
	
	// 2. by changing TYPE of parms
	public double sum(double a, double b, double c) {

		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverload a = new MethodOverload();
		a.sum(13, 15);
	}

}
