package com.techtorial.Tests.HeadlessDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HTMLUnitDriver {

        @Test

        public void amazonHTML() throws InterruptedException{

            WebDriver driver=new HtmlUnitDriver();
            driver.get("https://www.amazon.com");

            String actual=driver.getTitle();
            String expected="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
            Assert.assertEquals(expected,actual);

            String actualUrl=driver.getCurrentUrl();
            String expectedUrl="https://www.amazon.com/";
            Assert.assertEquals(actualUrl,expectedUrl);

            WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchfield.sendKeys("Iphone", Keys.ENTER);

            System.out.println(driver.getCurrentUrl());

            Thread.sleep(5000);

            List<WebElement> iphoneList =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

            for (WebElement links: iphoneList){
                String str=""+links.getText();
                System.out.println(str);
            }

            System.out.println("link :" + iphoneList.size());

        }
}
