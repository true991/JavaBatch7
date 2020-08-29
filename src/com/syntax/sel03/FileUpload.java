package com.syntax.sel03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static String url = "https://the-internet.herokuapp.com/upload";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(url);
		WebElement upl = driver.findElement(By.id("file-upload"));
		upl.sendKeys("C:\\Users\\Igor\\Desktop\\Syntax.Ex.TestCase.xlsx");
		WebElement submit = driver.findElement(By.id("file-submit"));
		submit.click();
		
		
		
		
	}
}
