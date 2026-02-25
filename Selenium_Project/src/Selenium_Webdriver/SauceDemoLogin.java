package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("first-name")).sendKeys("Himanshu");
        driver.findElement(By.id("last-name")).sendKeys("Raj");
        driver.findElement(By.id("postal-code")).sendKeys("123456");
        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("finish")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
