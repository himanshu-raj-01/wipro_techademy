package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Launching browser");
    }

    @Test
    public void loginTest() {
        System.out.println("Executing login test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing browser");
    }
}