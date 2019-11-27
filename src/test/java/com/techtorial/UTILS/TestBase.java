package com.techtorial.UTILS;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class TestBase {

    public WebDriver driver;

    @Parameters("driverName")

    @BeforeClass
    public void setUpDriver(String driverName) {

        driver = UtilsDRY.driverSetup(driverName);

//        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    // @AfterClass
    public void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
