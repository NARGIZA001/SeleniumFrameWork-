package com.techtorial.Tests.DropDown.After;

import com.techtorial.UTILS.Utils_DRY;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Anotation {

    public static WebDriver driver;

    @Test

    public void AlertINTRO () {

      driver= Utils_DRY.driverSetup("Chrome"); // using our method fro util class

    }

    @BeforeClass
    public void setUP(){
        driver=Utils_DRY.driverSetup("Chrome");
    }

    @AfterClass

    public void tearDown(){

        driver.quit();
    }

}
