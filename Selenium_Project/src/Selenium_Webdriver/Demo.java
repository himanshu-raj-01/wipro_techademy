package Selenium_Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1️⃣ Open Naukri Website
        driver.get("https://www.naukri.com/");

        // 2️⃣ Click on Login button
        driver.findElement(By.id("login_Layer")).click();

        // 3️⃣ Enter Email
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
                .sendKeys("your_email_here");

        // 4️⃣ Enter Password
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']"))
                .sendKeys("your_password_here");

        // 5️⃣ Click Login Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);

        // 6️⃣ Go to Profile Page
        driver.get("https://www.naukri.com/mnjuser/profile");

        Thread.sleep(3000);

        // 7️⃣ Locate file input field
        WebElement uploadButton = driver.findElement(By.xpath("//input[@type='file']"));

        // 8️⃣ Upload Resume (Provide full file path)
        uploadButton.sendKeys("C:\\Users\\YourName\\Documents\\resume.pdf");

        System.out.println("Resume Uploaded Successfully!");

        Thread.sleep(5000);

        driver.quit();
    }
}
