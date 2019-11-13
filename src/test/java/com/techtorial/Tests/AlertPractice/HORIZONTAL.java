package com.techtorial.Tests.AlertPractice;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HORIZONTAL {
    WebDriver driver;
    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome");

    }

    @Test
    public void Horizonside() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com");
        WebElement slider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        slider.click();
        Thread.sleep(1000);
        WebElement cll = driver.findElement(By.xpath("//input[@type='range']"));

        actions.clickAndHold(cll).moveByOffset(30,10).perform();

        Thread.sleep(1000);
    }


}
