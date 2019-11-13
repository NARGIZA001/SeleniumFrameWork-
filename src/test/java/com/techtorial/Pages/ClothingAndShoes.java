package com.techtorial.Pages;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class ClothingAndShoes {

    static WebDriver driver;

    @BeforeClass
    public void setup(){
        driver =Utils_DRY.driverSetup("chrome");
    }
}
