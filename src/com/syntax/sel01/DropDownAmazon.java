package com.syntax.sel01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAmazon {

	public static String url = "https://www.facebook.com/r.php?locale=en_US&display=page";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		Select sel1 = new Select(driver.findElement(By.id("month")));
		Select sel2 = new Select(driver.findElement(By.id("day")));
		Select sel3 = new Select(driver.findElement(By.id("year")));

		System.out.println("Size of month is: " + sel1.getOptions().size());
		sel1.selectByIndex(3);

		System.out.println("Size of days is: " + sel2.getOptions().size());
		sel2.selectByValue("7");

		System.out.println("Size of years is: " + sel3.getOptions().size());
		sel3.selectByVisibleText("1991");

		Thread.sleep(2000);

		driver.quit();

	}

}
