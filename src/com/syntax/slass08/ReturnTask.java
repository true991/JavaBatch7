package com.syntax.slass08;

public class ReturnTask {
	public static void main(String[] args) {
		ReturnData x = new ReturnData();

		boolean a = x.isEven(21);
		System.out.println(a);

		int b = x.isLarger(90, 100);
		System.out.println(b);

		boolean c = x.overHundred(12);
		System.out.println(c);
		
		String d = x.upper("hello");
		System.out.println(d);

	}

}
