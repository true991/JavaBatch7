package com.syntax.class07;

import java.util.Scanner;

public class PasswordTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a username");
		String user = scan.nextLine();

		while (user.isEmpty()) {
			System.out.println("Username cannot be empty");
			System.out.println("Enter a username");
			user = scan.nextLine();

		}

		System.out.println("Enter a password");
		String pass = scan.nextLine();
		String expectedPass = "HelloWorld";

		while (pass.isEmpty()) {
			System.out.println("Password cannot be empty");
			System.out.println("Enter a password");
			pass = scan.nextLine();
		}

		if (!pass.isEmpty()) {
			if (pass.isEmpty()) {
				System.out.println("Password cannot be empty");
				System.out.println("Enter a password");
				pass = scan.nextLine();
				
			} else if (pass.length() < 8) {
				System.out.println("Password is too short");
				System.out.println("Enter a password");
				pass = scan.nextLine();
			} else if (pass.contains(user)) {
				System.out.println("Password cannot contain username");
				System.out.println("Enter a password");
				pass = scan.nextLine();
			} else {
				System.out.println("Confirm a password");
				String conf = scan.nextLine();
				while (!conf.equals(pass)) {
					System.out.println("Passwords do not match");

				}

				System.out.println("Your username and password has been created");

			}
		}
	}
}




