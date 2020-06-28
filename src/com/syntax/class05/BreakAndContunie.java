package com.syntax.class05;

public class BreakAndContunie {

	public static void main(String[] args) {
//		We are counting from 1 to 10
//		We want to stop wnen we reach 4
		
		int i;
		for (i = 1; i <= 10; i++) {
			
			if (i == 4) {
				break;
			} System.out.println(i);
		}
		
		
		int k;
		for (k = 1; k < 10; k++) {
			if (k == 5) {
				System.out.println("Its five");
				continue;
			} System.out.println(k);
		}
		
		
		for (int x = 1; x <= 10; x ++) {
			if (x == 5 || x == 6 || x ==7) {
				continue;
			} System.out.println(x);
		}
		
		for (int y = 1; y < 101; y++ ) {
			if( y >= 35 && y<= 55) {
				continue;
			} System.out.println(y);
		}

	}

}
