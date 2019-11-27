package com.techtorial.Tests.HeadlessDriver;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class phantomScreenshot{
        WebDriver driver;
        @BeforeClass
        public void phantom(){
            PhantomJsDriverManager.phantomjs().setup();
            driver = new PhantomJSDriver();
        }
        @Test
        public void phantom2(){
            driver.get("https://www.amazon.com/");
            String url = "https://www.amazon.com/";
            String pageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
            String AcUrl = driver.getCurrentUrl();
            String AcTitle = driver.getTitle();
            Assert.assertEquals(url, AcUrl);
            Assert.assertEquals(pageTitle, AcTitle);
            WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("iphone" + Keys.ENTER);
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println(links.size());


            int a = 0;
            for (WebElement c : links) {
                if (c.getAttribute("href") != null) {
                    System.out.println(++a + " - " + c.getAttribute("href"));
                }
            }}
        @AfterMethod

        public void tearDown (ITestResult result) throws IOException {
            if (result.getStatus() == ITestResult.SUCCESS) {
                long timestamp = System.currentTimeMillis();
                File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/screenshots" + timestamp + ".jpg"));
                FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
            }
        }
}


