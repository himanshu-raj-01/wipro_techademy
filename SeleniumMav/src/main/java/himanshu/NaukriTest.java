package himanshu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.naukri.com");

        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        loginButton.click();

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
        email.sendKeys("himanshuraj@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("fA2xN4YcU@MzhTe");

        WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));login.click();

        System.out.println("Page Title After Login: " + driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}
