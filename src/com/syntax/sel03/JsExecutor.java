package com.syntax.sel03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
	
	static public String url = "https://www.amazon.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='blue'", search );
		// js.executeScript("arguments[0].click()", password );
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollBy(0, -300)");
		
		WebElement bTop = driver.findElement(By.className("navFooterBackToTopText"));
		js.executeScript("arguments[0].scrollIntoView(true);", bTop);
		
		
	}

}
