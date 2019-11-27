package com.techtorial.Tests.HomeWorks;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork_7  {

     WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");

    }


    @Test

    public void horizontal (int xoffset, int yoffset){
        Actions actions = new Actions(driver);
            driver.get("http://the-internet.herokuapp.com");
            WebElement slider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
            slider.click();
        WebElement move = driver.findElement(By.xpath("//input[@type='range']"));

        actions.clickAndHold(move).moveByOffset(xoffset,yoffset).perform();

    }


    @Test

    public void HorizontalTEST(){
        WebElement slider = driver.findElement(By.xpath(""));
        horizontal(30,10);

    }
}
