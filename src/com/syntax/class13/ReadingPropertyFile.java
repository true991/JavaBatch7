package com.syntax.class13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\Igor\\EclipseWorkspace\\Syntax#1\\configs\\Example.properties";
		
		FileInputStream file = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(file);
		
		String value1 = prop.getProperty("userName");
		
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		
		System.out.println(value2);
	}

}
	