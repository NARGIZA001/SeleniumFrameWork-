package com.techtorial.Tests.Practice;

import com.techtorial.Pages.JeweleryAndAccessoryPage;
import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class JeweleryAndAccessoriesTest{


    WebDriver driver;


   @BeforeClass
  public void setUp (){

    driver =Utils_DRY.driverSetup("chrome");

}

    @Test
    public  void Etsy() throws InterruptedException {


        driver.get("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855");
        Assert.assertEquals("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855",driver.getCurrentUrl());

        Wait<WebDriver> fluentWait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))   // max weight time
                .pollingEvery(Duration.ofSeconds(2))  //frequency
                .ignoring(NoSuchElementException.class); //which exception to ignore



        JeweleryAndAccessoryPage jAp=new JeweleryAndAccessoryPage(driver);
        jAp.over100.click();



        WebDriverWait wait=new WebDriverWait(driver,4);



        Assert.assertTrue(jAp.over100Radio.isSelected());

        Select selects =new Select(jAp.shipTo);
        selects.selectByVisibleText("Germany");

        String selectedCountry = selects.getFirstSelectedOption().getText();

        Assert.assertTrue(selectedCountry.contains("Germany"));




    }
}
