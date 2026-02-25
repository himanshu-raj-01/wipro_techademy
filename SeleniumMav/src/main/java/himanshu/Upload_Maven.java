package himanshu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Maven {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);

        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\KIIT\\Downloads\\resume_hr.pdf");
        Thread.sleep(2000);

        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}