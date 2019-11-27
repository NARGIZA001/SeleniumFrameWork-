package com.techtorial.Tests.Practice;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsaSpendingGov {
    WebDriver driver;


    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");

    }
    @Test

    public void agency () {

        driver.navigate().to("https://www.usaspending.gov/#/");

        Assert.assertEquals("https://www.usaspending.gov/#/",driver.getCurrentUrl());

        WebElement spexplorer=driver.findElement(By.xpath("//a[@class='full-menu__link']"));
          spexplorer.click();

        WebElement agency=driver.findElement(By.xpath("//a[@class='landing-option__button']"));
        agency.click();


    }
}
