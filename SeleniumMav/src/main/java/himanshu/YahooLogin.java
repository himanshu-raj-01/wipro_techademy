package himanshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("login-username")).sendKeys("himanshuraj.01@yahoo.com");
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("login-passwd")).sendKeys("Q1w2e3r4().....1");
        driver.findElement(By.id("login-signin")).click();

        Thread.sleep(3000);

        System.out.println("Login Successful");

        driver.quit();
    }
}
