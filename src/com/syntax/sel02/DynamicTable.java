package com.syntax.sel02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fdefault.aspx";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		username.sendKeys("Tester");
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		password.sendKeys("test");
		WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
		login.click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		System.out.println("Number of rows is : " + rows.size());

		for (int i = 0; i < rows.size(); i++) {
			String row = rows.get(i).getText();
			System.out.println(row);

			if (row.contains("Bob Feather") || row.contains("FamilyAlbum")) {
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]")).get(i - 1)
						.click();

			}
		}

	}

}
