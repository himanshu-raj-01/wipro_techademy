package testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class yahoo_login {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Test Suite Started");
    }

    @BeforeClass
    public void setupBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        System.out.println("Browser Launched Successfully");
    }

    @BeforeMethod
    public void openYahoo() {
        driver.get("https://login.yahoo.com/");
        System.out.println("Yahoo Login Page Opened");
    }

    @Test
    public void yahooLoginTest() {

        // Enter Email
        WebElement email = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        email.sendKeys("himanshuraj.01@yahoo.com");

        driver.findElement(By.id("login-signin")).click();

        // Enter Password
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
        password.sendKeys("Q1w2e3r4t5y6()..1");

        driver.findElement(By.id("login-signin")).click();

        // Wait for Yahoo homepage to load
        wait.until(ExpectedConditions.urlContains("yahoo.com"));
        System.out.println("Login Successful");

        // Wait for Mail icon (envelope icon beside More)
        WebElement mailIcon = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(@href,'mail.yahoo.com')]")));

        mailIcon.click();
        System.out.println("Clicked on Mail Icon");

        // Wait for Mail page
        wait.until(ExpectedConditions.urlContains("mail.yahoo.com"));

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("mail.yahoo.com"));

        System.out.println("Mail Page Opened Successfully");
    }

    @AfterMethod
    public void afterTestMethod() {
        System.out.println("Test Method Completed");
    }

    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        System.out.println("Browser Closed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Test Suite Finished");
    }
}
