package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.TestData;
import utils.ScreenshotUtil;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)
    public void loginTest(String username, String password, String expectedResult) {

        driver.findElement(By.id("user-name")).sendKeys(username);

        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();

        // SUCCESS CASE
        if (expectedResult.equals("success")) {

            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("inventory"),
                    "Login failed for valid credentials!");

        }

        // ERROR CASE (Invalid username/password)
        else if (expectedResult.equals("error")) {

            String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

            // Capture screenshot when login fails
            ScreenshotUtil.captureScreenshot(driver, "InvalidLogin_" + username);

            Assert.assertTrue(errorMessage.contains("Epic sadface"),
                    "Error message not displayed for invalid credentials!");
        }

        // EMPTY FIELD CASE
        else if (expectedResult.equals("empty")) {

            String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

            // Capture screenshot for empty login
            ScreenshotUtil.captureScreenshot(driver, "EmptyLogin");

            Assert.assertTrue(errorMessage.contains("Username is required"),
                    "Validation message not displayed for empty fields!");
        }
    }
}