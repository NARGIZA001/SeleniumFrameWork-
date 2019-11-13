package com.techtorial.Tests.Synchronization;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Synchronization {

    WebDriver driver;


    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome");

    }
    @Test
    public  void Etsy() throws InterruptedException {
        driver.get("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855");
        Assert.assertEquals("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855", driver.getCurrentUrl());

        WebDriverWait wait =new WebDriverWait(driver,10); // created a object of the WebDriverWait calss
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
    }

}
