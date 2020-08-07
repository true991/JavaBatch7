package com.syntax.sel01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='Password']"));
		
		textBox.sendKeys("Tester");
		password.sendKeys("test");
		
		Thread.sleep(2000);
		
		textBox.clear();
		password.clear();

//		WebElement ageGroup = driver.findElement(By.cssSelector("input[name='ageGroup']"));
//
//		System.out.println(ageGroup.isDisplayed()); //return boolean
//		System.out.println(ageGroup.isEnabled());   //return boolean
//		System.out.println(ageGroup.isSelected());  //return boolean
//
//		ageGroup.click();
//
//		Thread.sleep(2000);
//
//		System.out.println(ageGroup.isSelected());
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
