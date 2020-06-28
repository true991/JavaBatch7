package com.syntax.class06;

public class ArrayIntroduction {

	public static void main(String[] args) {
		// Array is a tray of tea cups

		int a, b, c, d;
		a = 10;
		b = 15;
		c = 20;
		d = 25;

		// Declaring
		int[] name = new int[4]; //index from 0 to 3
		name[0] = 10;
		name[1] = 15;
		name[2] = 20;
		name[3] = 25;
		
		System.out.println(name[1]);
		
		//if array is storing integer when I get one element I will get one int
		
		int element = name[3];
		
		System.out.println(element);
		
		String[] carArray; //preferred way
		String carArray1;  //Works but not preferred
		
		carArray = new String[3]; // index 0,1,2
		carArray[0] = "BWM";
		carArray[1] = "VW";
		carArray[2] = "Porsche";
		
		String car = carArray[2];
		System.out.println(car);
		
		char[] bruh = new char[5];
		bruh[0] = 'A';
		bruh[1] = 'B';
		bruh[2] = 'C';
		bruh[3] = 'D';
		bruh[4] = 'E';
		
		

	}

}
