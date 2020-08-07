package com.syntax.sel01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://amazon.com");

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(3000);

		driver.navigate().to("http://facebook.com");
		driver.navigate().back();

		Thread.sleep(3000);

		driver.quit();

	}

}
