package com.syntax.sel01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		
		driver.findElement(By.cssSelector("#btn_basic_example")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.list-group-item")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Whoohoo");
		driver.findElement(By.xpath("//button[contains(@class , 'btn')]")).click();
		driver.quit();
		
		
		
		
	}

}
