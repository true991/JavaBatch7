package com.syntax.sel02;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static String url = "http://www.syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get(url);

		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

		System.out.println("=== ROWS ===");

		System.out.println("Number of rows is : " + tableRow.size());

		Iterator<WebElement> it = tableRow.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getText());
		}

		System.out.println("=== COLUMS ===");

		List<WebElement> tableColums = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));

		System.out.println("Number of colums is : " + tableColums.size());

		for (WebElement webElement : tableColums) {
			System.out.println(webElement.getText());
		}

		driver.quit();

	}

}
