package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class Amazon {

    WebDriver driver;

   
    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("Browser launched");
    }

   
    @BeforeMethod
    public void openAmazon() {

        driver.get("https://www.amazon.in");
        System.out.println("Amazon opened");
    }

    
    @Test
    public void verifyTitle() {

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
    }

   
    @Test
    public void searchProduct() throws InterruptedException {

        WebElement searchBox =
                driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(3000);

        System.out.println("Search completed");
    }

    
    @Test
    public void clickFirstProduct() throws InterruptedException {

     
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(3000);

     
        driver.findElement(By.cssSelector("h2 a"))
                .click();

        Thread.sleep(3000);

        System.out.println("Clicked first product");
    }

  
    @Test
    public void addToCart() throws InterruptedException {

   
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("laptop");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        Thread.sleep(3000);

   
        driver.findElement(By.cssSelector("h2 a"))
                .click();

        Thread.sleep(3000);

     
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String window : allWindows) {
            if(!window.equals(mainWindow)) {
                driver.switchTo().window(window);
            }
        }

        Thread.sleep(3000);

     
        driver.findElement(By.id("add-to-cart-button"))
                .click();

        System.out.println("Product added to cart");

        Thread.sleep(3000);
    }

   
    @Test
    public void openCart() throws InterruptedException {

        driver.findElement(By.id("nav-cart"))
                .click();

        Thread.sleep(3000);

        System.out.println("Cart opened");
    }

 
    @AfterMethod
    public void afterTest() {
        System.out.println("Test finished");
    }

  
    @AfterClass
    public void closeBrowser() {

        driver.quit();
        System.out.println("Browser closed");
    }
}