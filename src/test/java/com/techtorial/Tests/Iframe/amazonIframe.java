package com.techtorial.Tests.Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class amazonIframe {

    WebDriver driver;
    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @Test

    public void amazonIfrm() throws InterruptedException {

        driver.navigate().to("https://www.amazon.com/");

        WebElement navigate = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_desktop-ad-center-1_desktop_iframe']"));
        navigate.click();
        Set<String> setOfWindowHandles = driver.getWindowHandles();
        String originalWindowHandle = driver.getWindowHandle();
        String secondWindowHandle = "";

        for (String dh :
                setOfWindowHandles) {
            if (!dh.equalsIgnoreCase(originalWindowHandle)) {
                secondWindowHandle = dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(2000);
        driver.close();

        WebElement imgOrg = driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/ape/static/fallback/US_CENTER_PROMO_BACKUP._CB1529701382_.jpg']"));
        String img = imgOrg.getText();
        String img2 = "https://images-na.ssl-images-amazon.com/images/G/01/ape/static/fallback/US_CENTER_PROMO_BACKUP._CB1529701382_.jpg";

    }

    @Test

    public void heroK(){



        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");


        WebElement textField = driver.findElement(By.id("tinymce"));
        WebElement element = driver.findElement(By.id("tinymce"));

        //switvhing the element when id is not available . so we can create webelemnt then switch frame to element
        driver.switchTo().frame(element);

        String expectedTxt="Hello World";

        textField.clear();

        textField.sendKeys(expectedTxt);

        Assert.assertEquals(textField.getText(),expectedTxt,"didn't pass assertion"); // log for tester

      //  driver.switchTo().frame(0); // swithcing by webelement

        // going out of the iframe (only one step out !!!)

        driver.switchTo().parentFrame();

        // bring to the very first iframe

        driver.switchTo().defaultContent(); //to a very first iframe





    }


    /*      WebElement child= driver.findElement(By.id("ape_Gateway_desktop-ad-center-1_desktop_placement"));
        child.click();
      //driver.navigate().back();
        driver.close();*/

    }
