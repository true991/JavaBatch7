package com.syntax.sel02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreTables {

	public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);

		List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));
		WebElement next = driver.findElement(By.xpath("//a[@class='next_link']"));

		boolean flag = true;

		while (flag) {
			for (WebElement row : rows) {
				String rowText = row.getText();
				if (rowText.contains("Archy J")) {
					flag = false;
					System.out.println(rowText);
					break;
				}
			}
			
			next.click();
		}
		
		driver.quit();

	}

}
