package com.syntax.sel03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
	
	static public String url = "http:\\amazon.com";
			
			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				// xpath/ folowing-sibling::tagname        next sibling, we can use index [1]
				// xpath/ preceding-sibling::tagname	   previous sibling
				// xpath/ parent::tagname                  move to parent 
				// xpath/ ancestor::tagname	               move to any grandfather
				
				
		
		
		
			}

}
