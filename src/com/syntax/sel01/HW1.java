package com.syntax.sel01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static String url = "http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);

		alert.accept();

		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();

		Thread.sleep(2000);

		alert.dismiss();

		System.out.println(driver.findElement(By.id("confirm-demo")).getText());

		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

		Thread.sleep(2000);

		alert.sendKeys("Hello");
		alert.accept();

		System.out.println(driver.findElement(By.id("prompt-demo")).getText());

		Thread.sleep(2000);
		
		driver.quit();

	}

}
