package com.syntax.class13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TaskProperty {
	public static void main(String[] args) throws IOException {
		
		//1st is set a file path into a String

		String filePath = "configs\\TaskFile";
		
		//2nd is creating new FileInputStream using a file path

		FileInputStream fis = new FileInputStream(filePath);
		
		//3rd is create a Properties and load FIS inside

		Properties prop = new Properties();

		prop.load(fis);

		String a = prop.getProperty("browser");
		String b = prop.getProperty("url");

		System.out.println(a + " and " + b);
		
		prop.setProperty("username", "some1");
		prop.setProperty("password", "wassup");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		
		
		
		prop.store(fos, "Changing");
		
		prop.clear();
	
		
		
		
		
		
	}

}
