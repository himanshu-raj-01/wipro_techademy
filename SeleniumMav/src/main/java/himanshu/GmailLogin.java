package himanshu;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://accounts.google.com/");
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId"))).sendKeys("himanshuraj.trial@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd"))).sendKeys("Q1w2e3r4t5y6()..1");
        driver.findElement(By.id("passwordNext")).click();


        System.out.println("Login Successful!");

        Thread.sleep(30000);
        driver.quit();
    }
}
