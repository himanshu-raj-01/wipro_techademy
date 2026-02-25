package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class first_demo {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing Browser");
        driver.quit();
    }

    @Test
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }
}
