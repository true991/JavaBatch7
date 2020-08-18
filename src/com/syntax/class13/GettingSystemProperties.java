package com.syntax.class13;

public class GettingSystemProperties {

	public static void main(String[] args) {

		String username = System.getProperty("user.name");
		
		String os = System.getProperty("os.name");
		
		String dir = System.getProperty("user.dir");
		
		System.out.println(username);
		System.out.println(os);
		System.out.println(dir);
		

	}

}
