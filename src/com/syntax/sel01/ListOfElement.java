package com.syntax.sel01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElement {

	public static String url = "http://166.62.36.207/syntaxpractice/basic-checkbox-demo.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));

		int size = checkBoxes.size();
		System.out.println(size);

		for (WebElement one : checkBoxes) {
			if (one.isEnabled()) {
				String a = one.getAttribute("value");
				if(a.equals("Option-2")) {
					one.click();
					Thread.sleep(1000);
					break;
				}

			}

		}

		for (WebElement webElement : checkBoxes) {

			System.out.println(webElement.isSelected());

		}

		Thread.sleep(2000);

		driver.quit();

	}
}
