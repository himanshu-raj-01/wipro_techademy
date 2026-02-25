package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        String filePath = "C:\\Users\\KIIT\\Downloads\\resume_hr.pdf";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        Thread.sleep(2000);

        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
