package com.syntax.sel02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {

	static public String url = "http://aa.com/homePage.do";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		WebElement dep = driver.findElement(By.id("aa-leavingOn"));
		dep.click();
		String mm = driver.findElement(By.xpath("//div[contains(@class, 'group-first')]/div/div/span[1]")).getText();
		String expectedDepMon = "November";
		while (!mm.equals(expectedDepMon)) {
			WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
			next.click();
			mm = driver.findElement(By.xpath("//div[contains(@class, 'group-first')]/div/div/span[1]")).getText();
		}
		List<WebElement> dDays = driver
				.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for (WebElement day : dDays) {
			String x = day.getText();
			if (x.equals("7")) {
				day.click();
				break;
			}
		}
		WebElement arr = driver.findElement(By.id("aa-returningFrom"));
		arr.click();
		mm = driver.findElement(By.xpath("//div[contains(@class, 'group-first')]/div/div/span[1]")).getText();
		String expectedArrMon = "January";
		while (!mm.equals(expectedArrMon)) {
			WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
			next.click();
			mm = driver.findElement(By.xpath("//div[contains(@class, 'group-first')]/div/div/span[1]")).getText();
		}
		List<WebElement> aDays = driver
				.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for (WebElement day : aDays) {
			String x = day.getText();
			if (x.equals("11")) {
				day.click();
				break;
			}
		}
		WebElement dest = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		dest.click();
		dest.sendKeys("london");
		WebElement submit = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
		submit.click();
		driver.quit();
		System.out.println("Passed");
	}
}
