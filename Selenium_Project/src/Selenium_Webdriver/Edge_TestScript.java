package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_TestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
			String title = driver.getTitle();
			System.out.println("Page Title : " + title);
			
			if(title.contains("Google")) {
				System.out.println("Test Pass");
			} else {
				System.out.println("Test Fail");
			}

			
		} catch(Exception e) {
			System.out.println("Exception occured : " + e.getMessage());
		} finally {
			driver.quit();
		}

	}

}
