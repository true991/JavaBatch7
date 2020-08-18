package com.syntax.sel01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		driver.switchTo().frame("FrameOne");
		WebElement logo = driver.findElement(By.id("hide"));
		if (logo.isDisplayed()) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is NOT displayed");
		}
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		WebElement but = driver.findElement(By.className("enroll-btn"));
		if (but.isEnabled()) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is NOT enabled");
		}

		driver.switchTo().defaultContent();

		driver.quit();

	}

}
