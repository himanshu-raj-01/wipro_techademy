package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class first_test {

	@Test
	public void openGoogle() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        System.out.println("Page Title: " + driver.getTitle());
        
        driver.quit();

	}

}