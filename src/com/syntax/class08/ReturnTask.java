package com.syntax.class08;

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

		System.out.println(x.eMail("Harry", "Potter", "gmail.com"));

		System.out.println(x.isPrime(1));

		System.out.println(x.grade(2));

		int[] arr = { 12, 22, 44, 11 };

		System.out.println(x.largestFromArray(arr));
		
		String [] qwerty = x.getArray("Hello How Are You");
		
		for (String str : qwerty) {
			System.out.println(str);
		}
			

	}

}
