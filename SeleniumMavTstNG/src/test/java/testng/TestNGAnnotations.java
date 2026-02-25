package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAnnotations {

    WebDriver driver;

    // SUITE LEVEL
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Suite execution started");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Suite execution finished");
    }

    // TEST LEVEL
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Preparing test environment");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Test execution completed");
    }

    // CLASS LEVEL
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Launching Browser");
        // Selenium Manager automatically handles driver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Closing Browser");
        if (driver != null) {
            driver.quit();
        }
    }

    // METHOD LEVEL
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Opening Google");
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Test Completed");
    }

    // TEST CASES
    @Test(priority = 1)
    public void verifyTitle() {
        System.out.println("Executing Test 1");
        System.out.println("Page Title: " + driver.getTitle());
    }

    @Test(priority = 2)
    public void verifyURL() {
        System.out.println("Executing Test 2");
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }
}
