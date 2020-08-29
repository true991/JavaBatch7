package com.syntax.sel03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickDemo {
	
	public static String url = "http://demo.guru99.com/test/simple_context_menu.html";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get(url);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightClick).perform();
		WebElement edit = driver.findElement(By.xpath("//span[text() = 'Edit']"));
		action.click(edit).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement doubleClick = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		action.doubleClick(doubleClick).perform();
		alert.accept();
		
		
	}

}
