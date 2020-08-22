package com.syntax.sel02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static String url = "http://accounts.google.com/signup";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		String mainPageHandle = driver.getWindowHandle();

		System.out.println(mainPageHandle);

		WebElement helpClick = driver.findElement(By.linkText("Справка"));

		helpClick.click();

		Set<String> allWindowsHandles = driver.getWindowHandles();

		System.out.println(allWindowsHandles.size());

		Iterator<String> it = allWindowsHandles.iterator();

		mainPageHandle = it.next();

		String childPage = it.next();
		System.out.println(childPage);
		
		driver.switchTo().window(mainPageHandle);

	}
}
