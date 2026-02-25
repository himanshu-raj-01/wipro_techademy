package himanshu;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo_Maven {

    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome Options to disable popups and password managers
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-password-generation");
        options.addArguments("--disable-features=PasswordLeakDetection");
        options.addArguments("--incognito");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        
        

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack"))).click();

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