package com.syntax.sel02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
	
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Hum@nhrm123");
		WebElement loginBut = driver.findElement(By.id("btnLogin"));
		loginBut.click();
		
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		leave.click();
		WebElement leaveList = driver.findElement(By.id("menu_leave_viewLeaveList"));
		leaveList.click();
		
		WebElement from = driver.findElement(By.id("calFromDate"));
		from.click();
		
		WebElement monthFrom = driver.findElement(By.className("ui-datepicker-month"));
		Select monDD = new Select(monthFrom);
		monDD.selectByVisibleText("Oct");
		
		WebElement yearFrom = driver.findElement(By.className("ui-datepicker-year"));
		Select yearDD = new Select(yearFrom);
		yearDD.selectByVisibleText("2021");
		
		List<WebElement> daysFrom = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for (WebElement fromDate : daysFrom) {
			
			if(fromDate.getText().equals("15")) {
				fromDate.click();
				break;
			}
			
		}
		
		
		
		
		
		
		

	}
}
