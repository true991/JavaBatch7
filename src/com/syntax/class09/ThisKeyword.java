package com.syntax.class09;

public class ThisKeyword {

	int a, b;
	
	ThisKeyword(){
		System.out.println("Do not really not	");
	}

	ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void sum (int a, int b) {
		System.out.println(a+b);
		System.out.println(this.a + this.b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(100, 200);
		obj.sum(10, 20);
		
		ThisKeyword obj1 = new ThisKeyword();
		
		
	}

}
