package com.syntax.sel01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static String url = "http://amazon.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement link : links) {
			String a = link.getText();
			String b = link.getAttribute("href");

			if (!a.isEmpty()) {
				System.out.println(a + "      " + b);

			}

		}

		Thread.sleep(3000);
		driver.quit();

	}

}
