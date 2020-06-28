package com.syntax.class04;

public class Task {
	public static void main(String[] args) {
		Boolean vacation = true;  
		int day = 2;
		
		String alarmClock = "none";
		  if(!vacation) {
		    switch (day) {
		      case 1:
		      case 2:
		      case 3:
		      case 4:
		      case 5:
		        alarmClock = "7:00";
		        break;
		      case 6:
		      case 7:
		        alarmClock = "10:00";
		        break;
		      default:
			    alarmClock = "off";  
		    }
		  } else if (vacation) {
		    switch (day) {
		      case 1:
		      case 2:
		      case 3:
		      case 4:
		      case 5:
		        alarmClock = "10:00";
		        break;
		      case 6:
		      case 7:
		        alarmClock = "off" ;
		        break;
		      default:
			    alarmClock = "off";   
		    }
		  } System.out.println(alarmClock); 
		}
	}


