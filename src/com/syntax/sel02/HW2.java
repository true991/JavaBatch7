package com.syntax.sel02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW2 {

	public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		checkBox.click();

		WebElement remove = driver.findElement(By.xpath("//button[contains(text(), 'Remove')]"));
		remove.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

		WebElement message = driver.findElement(By.id("message"));
		String text = message.getText();

		if (text.equals("It's gone!")) {
			System.out.println("Correct");
		} else {
			System.out.println("Fail");
		}

		System.out.println("================");

		WebElement enable = driver.findElement(By.xpath("//button[text() = 'Enable']"));
		enable.click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='text']"))));
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		Boolean isEnabled = textBox.isEnabled();
		System.out.println("Text box is enabled : " + isEnabled);
		textBox.sendKeys("Citius!Altius!Fortius!");
		WebElement disable = driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
		disable.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

		System.out.println("Text box is enabled : " + isEnabled);

		driver.quit();

	}

}
