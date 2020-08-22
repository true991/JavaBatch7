package com.syntax.sel02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows_2 {

	public static String url = "http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		String mainPage = driver.getWindowHandle();
		WebElement insta = driver.findElement(By.linkText("Follow On Instagram"));
		WebElement faceb = driver.findElement(By.linkText("Follow On Instagram"));
		WebElement both = driver.findElement(By.linkText("Follow Instagram & Facebook"));

		insta.click();
		faceb.click();
		both.click();

		Set<String> allWindowsHandles = driver.getWindowHandles();
		System.out.println(allWindowsHandles);
		System.out.println("========================================");
		System.out.println(allWindowsHandles.size());
		Iterator<String> it = allWindowsHandles.iterator();

		while (it.hasNext()) {
			String child = it.next();
			if (!child.equals(mainPage)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(mainPage);
		
		driver.quit();

	}

}
