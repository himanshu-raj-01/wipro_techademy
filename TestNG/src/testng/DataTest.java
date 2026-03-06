package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println(username + " " + password);
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"}
        };
    }
}