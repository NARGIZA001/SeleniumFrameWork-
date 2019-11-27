package com.techtorial.Tests.HeadlessDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PhantomJSdriver {

    WebDriver driver;

    @Test

    public void amazonPhanton() throws InterruptedException {

        WebDriverManager.phantomjs().setup();
        WebDriver driver = new PhantomJSDriver();
        driver.get("https://www.amazon.com");

        String actual = driver.getTitle();
        String expected = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(expected, actual);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(actualUrl, expectedUrl);

        WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchfield.sendKeys("Iphone", Keys.ENTER);

        // WebElement searchbutton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
        //searchbutton.click();

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);

        List<WebElement> iphoneList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        for (WebElement links : iphoneList) {
            String str = links.getText();
            System.out.println(str);
        }

        System.out.println("link :" + iphoneList.size());

    }

    @AfterMethod

    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {

            long timestamp = System.currentTimeMillis();

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);              // takes the screenShot

            FileUtils.copyFile(src, new File("src/test/screenshots/" + timestamp + ".jpg"));    // copies the image and stores it in the file
        }

        driver.close();
    }
}