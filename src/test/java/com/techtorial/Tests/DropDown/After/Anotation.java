package com.techtorial.Tests.DropDown.After;

import com.techtorial.UTILS.UtilsDRY;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Anotation {

    public static WebDriver driver;

    @Test

    public void AlertINTRO () {

      driver= UtilsDRY.driverSetup("Chrome"); // using our method fro util class

    }

    @BeforeClass
    public void setUP(){
        driver=UtilsDRY.driverSetup("Chrome");
    }

    @AfterClass

    public void tearDown(){

        driver.quit();
    }

}
