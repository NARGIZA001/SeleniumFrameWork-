package com.techtorial.Tests;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUpDriver (){

        driver =Utils_DRY.driverSetup("chrome");

    }
   // @AfterClass
    public void closeDriver(){

        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
