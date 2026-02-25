package himanshu;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        System.out.println("Login Successful");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys("Himanshu");
        driver.findElement(By.name("lastName")).sendKeys("Raj");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
        System.out.println("Employee Added Successfully");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-body']")));
        System.out.println("Displayed in Employee List");
        Thread.sleep(3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-userdropdown-tab']"))).click();
        Thread.sleep(2000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']"))).click();
        Thread.sleep(3000);

        System.out.println("Logged Out Successfully");
        Thread.sleep(3000);

        driver.quit();
    }
}