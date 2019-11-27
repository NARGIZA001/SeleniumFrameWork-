package com.techtorial.Tests.WindowHandle;

import com.techtorial.UTILS.UtilsDRY;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Google {


    WebDriver driver;
    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");

    }

    @Test

    public void GoogleSearch(){

        //Actions actions=new Actions(driver);
        driver.get("https://www.google.com");

        WebElement serachField = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")); //input class="gLFyf gsfi"

        serachField.sendKeys("hello world");
        serachField.click();

        WebElement serachField2 = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        serachField2.click();

        String window_1= driver.getWindowHandle();
        driver.getTitle();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).perform();
        WebElement newLink= driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3"));
        newLink.click();

        Set<String> setOfwindows= driver.getWindowHandles();

        String window_2="";

        for (String datahandle : setOfwindows){
            if (!datahandle.equalsIgnoreCase(window_1)){
                window_2=datahandle;

            }
        }

        driver.switchTo().window(window_2);

        driver.getTitle();

    }

    @Test

    public void GoogleSearch_2() throws  InterruptedException{
        driver.get("https://www.google.com");

        Actions actions=new Actions(driver);

        WebElement serachField = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")); //input class="gLFyf gsfi"

        serachField.sendKeys("hello world");

        serachField.click();
        WebElement serachField2 = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));

        serachField2.click();

        WebElement serachField3 = driver.findElement(By.xpath("//body[@jsmodel='jivSc']"));

        serachField3.click();

        actions.keyDown(Keys.COMMAND).sendKeys("a").perform();




        //actions.keyDown(Keys.COMMAND).sendKeys(Keys.chord(Keys.CONTROL, "a"));






    }



}
