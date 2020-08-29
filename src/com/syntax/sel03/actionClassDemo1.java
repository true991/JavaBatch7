package com.syntax.sel03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassDemo1 {
	
	public static String url = "http:\\amazon.com";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get(url);
		
		WebElement accountAndList = driver.findElement(By.id("nav-link-accountList"));
		
		action.moveToElement(accountAndList).perform();
		
		
		
	}

}
