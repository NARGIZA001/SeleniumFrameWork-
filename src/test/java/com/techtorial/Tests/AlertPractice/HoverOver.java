package com.techtorial.Tests.AlertPractice;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HoverOver {
    WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");

    }


    @Test
    public void hoverOver(){

        driver.get("http://the-internet.herokuapp.com/");
        // WebElement bmw= driver.findElement(By.id("radio-btn-example"));

        WebElement hoverText = driver.findElement(By.xpath("//h3")); //<a href="/hovers">Hovers</a>
        hoverText.click();
        Assert.assertEquals("Hovers", hoverText.getText());


    }
}
