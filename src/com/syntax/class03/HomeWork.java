package com.syntax.class03;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
	  	Scanner scan = new Scanner(System.in);
	  	
	  	System.out.println("Please enter your mark");
	  	int i = scan.nextInt();
	  	char score = 0;
	  	
	  	if (i>0 && i<25) {
	  	  score = 'F';
	  	} else if (i>=25 && i<45) {
	  	  score = 'E';
	  	} else if (i>=45 && i<50) {
	  	  score = 'D';
	  	} else if (i>=50 && i<60) {
	  	  score = 'C';
	  	} else if (i>=60 && i<80) {
	  	  score = 'B';
	  	} else if (i>=80) {
	  	  score = 'A';
	  	} else {
	  	  System.out.println("Please enter valid mark");
	  	}
	  	
	  	 System.out.println("Your grade is " + score);
  }
}