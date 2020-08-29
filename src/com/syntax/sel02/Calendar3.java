package com.syntax.sel02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar3 {
	
	/* depart date
	 * return date
	 * destination
	 * search
	 * quit the browser
	 */

	public static String url = "https://www.aa.com/homePage.do";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		
		
		
		
		
		
		
		

	}

}
