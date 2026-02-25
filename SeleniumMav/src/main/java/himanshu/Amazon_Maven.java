package himanshu;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Maven {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        // Search for iPhone
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("iPhone");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait for results to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-component-type='s-search-result']")));

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 300).perform();
        Thread.sleep(2000);

        WebElement addToCart1 = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']//button[contains(@id, 'a-autoid') and contains(.,'Add to cart')])[1]"));
        addToCart1.click();
        Thread.sleep(2000);

        WebElement addToCart2 = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']//button[contains(@id, 'a-autoid') and contains(.,'Add to cart')])[2]"));
        addToCart2.click();
        Thread.sleep(2000);
        
        WebElement addToCart3 = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']//button[contains(.,'Add to cart')])[3]"));
        addToCart3.click();
        
        WebElement goToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Go to Cart')]")));
        goToCartBtn.click();

        Thread.sleep(3000);
        driver.quit();
    }
}