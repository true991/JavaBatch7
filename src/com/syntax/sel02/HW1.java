package com.syntax.sel02;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

		WebElement but1 = driver.findElement(By.id("tabButton"));
		WebElement but2 = driver.findElement(By.id("windowButton"));
		WebElement but3 = driver.findElement(By.xpath("//button[contains(text(), 'New Window Message')]"));

		but1.click();
		but2.click();
		but3.click();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();

		String mainPage = it.next();
		String one = it.next();
		String two = it.next();
		String three = it.next();

		System.out.println(one);

		driver.switchTo().window(two);

		System.out.println("The first button --> " + driver.findElement(By.id("sampleHeading")).getText());
		driver.close();

		driver.switchTo().window(three);

		System.out.println("The second button --> " + driver.findElement(By.id("sampleHeading")).getText());
		driver.close();

		driver.switchTo().window(mainPage);

		Boolean title = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']")).isDisplayed();
		System.out.println("Is title displayed? --> " + title);

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
