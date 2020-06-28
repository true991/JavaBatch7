package com.syntax.class03;

import java.util.Scanner;

public class MoreNested {
	 public static void main (String [] args) {
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Is it weekend?");
		    boolean day = scan.nextBoolean();
		    
		    String subject;
		    
		    if(day) {
		      subject = "Manual testing";
		    } else {
		      subject = "Java";
		    }
		    System.out.println("Today you will be learning " + subject);
		    
		    
		    
		    
		  }

		}