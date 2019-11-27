package com.techtorial.Tests.Practice;

import com.techtorial.UTILS.UtilsDRY;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;



public class PracticeSelenium {

        WebDriver driver;

        @BeforeClass
        public void setUp (){

            driver =UtilsDRY.driverSetup("chrome");

        }

        @Test
        public void RadioBUtton () {
            driver.get("https://learn.letskodeit.com/p/practice");
           // WebElement bmw= driver.findElement(By.id("radio-btn-example"));

            WebElement bmw = driver.findElement(By.id("bmwradio"));
            bmw.click();


        }


    @Test
    public void DropDown () {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement benz = driver.findElement(By.id("carselect"));

        Select select=new Select(benz); // you must provide the WebElement

        select.selectByVisibleText("Benz");


    }

    @Test
    public void MultipleEX () {
        driver.get("https://learn.letskodeit.com/p/practice");
        // WebElement bmw= driver.findElement(By.id("radio-btn-example"));

        WebElement orange= driver.findElement(By.id("multiple-select-example"));

        Select select=new Select(orange); // you must provide the WebElement

        select.selectByVisibleText("Apple");
        select.selectByVisibleText("Orange");
        select.selectByVisibleText("Peach");
        select.deselectByIndex(2);

        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

    @Test
    public void CHeckBox () {
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement benz= driver.findElement(By.id("benzcheck"));

        benz.click();

        Assert.assertTrue(benz.isSelected());

    }

    @Test
    public void NewWindow () throws InterruptedException {

        driver.get("https://learn.letskodeit.com/p/practice");


        WebElement openwindow = driver.findElement(By.id("openwindow"));
        String window_1 = driver.getTitle();
        System.out.println("#1 titel ...... " + window_1);
        openwindow.click();

        String firstHandle = driver.getWindowHandle();

        Thread.sleep(3000);
        Set<String> setOfwindows = driver.getWindowHandles();
        String secondWindowHandle = "";

        for (String h : setOfwindows) {

            if (!firstHandle.equalsIgnoreCase(window_1)) {

                secondWindowHandle = h;
            }

        }
        driver.switchTo().window(secondWindowHandle);
        String secondWindowTitle=driver.getTitle();
        Assert.assertFalse((window_1.equalsIgnoreCase(secondWindowTitle)));
       // <div data-course-id="56741"
        //div data-course-id="56739"


    }


}
