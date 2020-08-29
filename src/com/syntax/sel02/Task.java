package com.syntax.sel02;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

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

		WebElement pim = driver.findElement(By.linkText("PIM"));
		pim.click();
		WebElement addEmp = driver.findElement(By.id("menu_pim_addEmployee"));
		addEmp.click();

		WebElement name = driver.findElement(By.id("firstName"));
		name.sendKeys("!Hermione");
		WebElement surname = driver.findElement(By.id("lastName"));
		surname.sendKeys("Granger");

		WebElement empId = driver.findElement(By.id("employeeId"));
		String myId = empId.getAttribute("value");
		System.out.println(myId);

		WebElement save = driver.findElement(By.id("btnSave"));
		save.click();

		WebElement list = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		list.click();

		WebElement sort = driver.findElement(By.xpath("//a[text()='First (& Middle) Name']"));
		sort.click();

		boolean flag = true;

		while (flag) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			for (WebElement row : rows) {
				String check = row.getText();
				if (check.contains(myId)) {
					WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
					checkBox.click();
					WebElement delete = driver.findElement(By.id("btnDelete"));
					delete.click();
					WebElement confirm = driver.findElement(By.id("dialogDeleteBtn"));
					confirm.click();
					flag = false;
					break;
				}

			}
			WebElement next = driver.findElement(By.linkText("Next"));
			next.click();

		}

		driver.quit();

	}

}
