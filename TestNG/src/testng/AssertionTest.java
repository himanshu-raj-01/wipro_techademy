package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test
    public void verifyTitle() {
        String actual = "Google";
        String expected = "Google";

        Assert.assertEquals(actual, expected);
    }
}