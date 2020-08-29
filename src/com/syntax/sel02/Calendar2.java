package com.syntax.sel02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {
	
	public static String url = "https://www.delta.com/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		WebElement lang = driver.findElement(By.xpath("//button[text()='United States - English']"));
		lang.click();

		WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
		calendar.click();
		WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));

		String departMonth = dMonth.getText();

		while (!departMonth.equals("October")) {
			WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
			departMonth = dMonth.getText();

		}

		List<WebElement> departDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));

		for (WebElement day : departDates) {

			if (day.getText().equals("11")) {
				day.click();
				break;
			}

		}

		WebElement rMonth = driver.findElement(By.className("dl-datepicker-month-1"));
		String returnMonth = rMonth.getText();

		while (!returnMonth.equals("December")) {
			WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
			returnMonth = rMonth.getText();

		}

		List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));

		for (WebElement returnDay : returnDates) {

			if (returnDay.getText().equals("25")) {
				returnDay.click();
				break;
			}

		}
		
		WebElement done = driver.findElement(By.className("donebutton"));
		done.click();

	}
}
