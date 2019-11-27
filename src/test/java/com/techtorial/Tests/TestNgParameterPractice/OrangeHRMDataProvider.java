package com.techtorial.Tests.TestNgParameterPractice;

import com.techtorial.Pages.OrangeHRMPage;
import com.techtorial.UTILS.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends TestBase {

    @DataProvider(name="Credentials")

    public static Object[] []credential(){
        return new Object [] [] {{"admin", "admin123"}, {"testUserName", "testPassword"},
                {"UserName", "testPassword"},{"testUserName", "Password"}};
    }

    @Test (dataProvider = "Credentials")

    public void loginPageTest(String orangeUsername, String orangePassword) {

        OrangeHRMPage orange=new OrangeHRMPage(driver);

        driver.navigate().to("https://orangehrm-demo-6x.orangehrmlive.com/");

        orange.username.clear();
        orange.username.sendKeys(orangeUsername);
        orange.password.clear();
        orange.password.sendKeys(orangePassword);
        orange.loginButton.click();

        if (orangeUsername.equals("admin")& orangePassword.equals("admin123")) {

            String actual = orange.pagetitel.getText();

            String expected = "Dashboard";            //Expected values is coming  from the business requirements.

            Assert.assertEquals(expected, actual);

            orange.dropDownButton.click();
            orange.logOutButton.click();

        }else{
            String actual=orange.reTry.getText();
            String expected="Retry Login";
            Assert.assertEquals(actual,expected);
            driver.navigate().back();
        }
    }
}
