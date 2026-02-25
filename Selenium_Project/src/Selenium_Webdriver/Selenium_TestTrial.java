package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_TestTrial {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");

			Thread.sleep(3000);

			// Scroll Down
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(3000);

			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(3000);

			// Scroll Up
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(3000);


			driver.navigate().back();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		} finally {
			driver.quit();
		}
	}
}
