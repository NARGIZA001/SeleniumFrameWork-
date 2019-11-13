package com.techtorial.Tests.HomeWorks;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork_8 {

    WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome");

    }

    @Test
    public void avatarCheck () throws InterruptedException{


        driver.get("http://the-internet.herokuapp.com/");

        Actions act =new Actions(driver);
        WebElement hovers = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hovers.click();
        Thread.sleep(5000);

        WebElement an_avatar1 =driver.findElement(By.xpath("//a[@href='/users/1']"));
        WebElement an_avatar2 =driver.findElement(By.xpath("//a[@href='/users/2']"));
        WebElement an_avatar3 =driver.findElement(By.xpath("//a[@href='/users/3']"));


        WebElement imgAvatar1 =driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        WebElement imgAvatar2 =driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        WebElement imgAvatar3 =driver.findElement(By.xpath("//a[@href='/users/3']/../../img"));
        Thread.sleep(5000);

        Assert.assertFalse(an_avatar1.isDisplayed());
        Assert.assertFalse(an_avatar2.isDisplayed());
        Assert.assertFalse(an_avatar3.isDisplayed());
        Thread.sleep(5000);

        act.moveToElement(imgAvatar1).build().perform();
        //The build() method is used compile all the listed actions into a single step.
        // we have to use build() when we are performing sequence of operations
        // and no need to use when we are performing a single action.
        //perform() method is used here to execute the action, without this method your action won't be completed.

        Assert.assertTrue(an_avatar1.isDisplayed()); //while cursor is on img #1 the rest must not be displayed
        Assert.assertFalse(an_avatar2.isDisplayed()); // therefore avatar 1 is .assertTrue...
        Assert.assertFalse(an_avatar3.isDisplayed());
        Thread.sleep(5000);

        act.moveToElement(imgAvatar2).build().perform();//while cursor is on img #2 the rest must not be displayed
        Assert.assertFalse(an_avatar1.isDisplayed());
        Assert.assertTrue(an_avatar2.isDisplayed());  // therefore avatar 2 is .assertTrue...
        Assert.assertFalse(an_avatar3.isDisplayed());
        Thread.sleep(5000);

        act.moveToElement(imgAvatar3).build().perform();//while cursor is on img #3 the rest must not be displayed
        Assert.assertFalse(an_avatar1.isDisplayed());
        Assert.assertFalse(an_avatar2.isDisplayed());
        Assert.assertTrue(an_avatar3.isDisplayed()); // therefore avatar 3 is .assertTrue...
    }

}
