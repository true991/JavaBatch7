package com.syntax.sel01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		driver.findElement(By.name("username")).sendKeys("Harry Potter");
		
		driver.findElement(By.name("password")).sendKeys("123412341234");
		
		driver.findElement(By.linkText("Register")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
