package com.techtorial.JScript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSIntro {

    WebDriver driver;
    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @Test

    public void jsTest() throws InterruptedException{

        //driver.get("https://www.google.com/");

        //JavaScriptExecuter

        //JavascriptExecutor is a interface

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");

        // this is second way of opening the browser by using the javaScript .

        driver.getTitle();

        String title= js.executeScript("return document.title").toString();
        // trying to get the title using javaScript

        System.out.println("My page's title is : " + title);

        // get url

        String url= js.executeScript("return document.URL").toString();

        System.out.println("My page's url:  " + url);

        //scrolling down

        driver.navigate().to("http://hayat.com");

        js.executeScript("window.scrollBy(0,10000)"); // goes all the way down

        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,-10000)"); // comes back to the zero point.

        // generate a custome alert

        //js.executeScript("alert('My custom alert')");

        //click

       WebElement button=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));

       js.executeScript("argument[0].click()", button); //div[@class='FPdoLc VlcLAe']//input[@value='Google Search']

        driver.navigate().to("https://www.amazon.com");

        //sendKeys alternative

        js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");







    }


}
