package com.techtorial.Tests.ScreenShots;

import com.techtorial.UTILS.Utils_DRY;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest {

    WebDriver driver;



    @BeforeClass
    public void setup(){

        driver =Utils_DRY.driverSetup("chrome");
    }

    @Test
    public void screenshotTest(){


        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.id("bvxktclbob"));
        System.out.println(element.getText());
    }

    @AfterMethod

    public void tearDown(ITestResult result)throws IOException {

        if (result.getStatus()== ITestResult.FAILURE){

            long timestamp=System.currentTimeMillis();

            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);              // takes the screenShot

            FileUtils.copyFile(src,new File("src/test/screenshots/"+ timestamp + ".jpg"));    // copies the image and stores it in the file
        }
        driver.close();
    }

}
