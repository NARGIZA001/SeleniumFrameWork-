package com.techtorial.Tests.TestNgParameterPractice;

import com.techtorial.Pages.OrangeHRMPage;
import com.techtorial.UTILS.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends TestBase {


    @Test
    public void loginTest() throws InterruptedException {
        OrangeHRMPage orange = new OrangeHRMPage(driver);

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        Thread.sleep(4000);
        orange.username.clear();
        orange.username.sendKeys("admin");
        orange.password.clear();
        orange.password.sendKeys("admin123");
        orange.loginButton.click();

        String actual = orange.pagetitel.getText();

        String expected = "Dashboard";  //Expected values is coming  from the business requirements.

        Assert.assertEquals(expected, actual);

        driver.navigate().back();
    }

}
