package com.syntax.sel02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static String url = "http://www.uitestpractice.com/Students/Contact";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Common syntax for Implicit wait
		driver.manage().window().maximize();
		driver.get(url);

		WebElement butt = driver.findElement(By.linkText("AjaxCall"));
		butt.click();
		driver.findElement(By.cssSelector("a[data-ajax-mode='replace']")).click();
		String reach = driver.findElement(By.className("ContactUs")).getText();
		System.out.println(reach);
		System.out.println("=== DONE ===");

		driver.quit();

	}

}
