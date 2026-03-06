package utils;

import org.testng.annotations.DataProvider;
/*
public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][] {

                // Valid username & valid password → Expected: Success
                {"standard_user", "secret_sauce", "success"},

                // Valid username & invalid password → Expected: Error
                {"standard_user", "wrong_password", "error"},

                // Invalid username & valid password → Expected: Error
                {"wrong_user", "secret_sauce", "error"},

                // Empty fields → Expected: Error
                {"", "", "empty"}

        };
    }
}*/
public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/LoginData.xlsx";

        return ExcelUtil.getTestData(filePath, "Sheet1");
    }
}