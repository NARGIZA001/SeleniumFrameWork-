package com.techtorial.Tests.MouseAction;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseAction {

    WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");
        // driver first time initialize in this line

    }

    @Test
    public void test1(){

        driver.get("www.google.com");

        driver=UtilsDRY.driverSetup("chrome");
        // since we initialized it before, it will not initialize in this line because of singleton pattern

        driver=UtilsDRY.driverSetup("ff");

    }

    @Test
    public void mouseActionsIntro  (){


        Actions actions=new Actions(driver);

        WebElement webElement= driver.findElement(By.xpath(""));

        actions.click(); // for one click

        actions.doubleClick(webElement).perform(); //for double click

        actions.contextClick(webElement).perform(); // for right click to see the context | or options

        actions.moveToElement(webElement).perform(); // hover over

        //actions.dragAndDrop().perform(); // source element

       // actions.dragAndDropBy().perform();



    }

    @Test
    public void DragAndDrop  () {

        Actions actions=new Actions(driver);


        driver.get("http://the-internet.herokuapp.com");

        WebElement dragD = driver.findElement(By.xpath("//a[@href='/drag_and_drop']")); ///drag_and_drop
        dragD.click();

        WebElement a=driver.findElement(By.id("column-a"));
        a.click();
        WebElement b=driver.findElement(By.id("column-b"));
        actions.dragAndDrop(a,b).perform();


    }



}
