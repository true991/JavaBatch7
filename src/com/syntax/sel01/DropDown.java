package com.syntax.sel01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html");

		// SELECT CLASS

		Select sel = new Select(driver.findElement(By.id("select-demo")));

		sel.selectByIndex(1);

		Thread.sleep(1000);

		sel.selectByVisibleText("Wednesday");

		Thread.sleep(1000);

		sel.selectByValue("Friday");

		Thread.sleep(1000);

		List<WebElement> options = sel.getOptions();

		for (int i = 0; i < options.size(); i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}

		
		
		
		
		
		
		System.out.println("SUCCESS MOTHERF*CKER");
		driver.quit();

	}
}
