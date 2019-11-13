package com.techtorial.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JeweleryAndAccessoryPage {

    WebDriver driver;


    public JeweleryAndAccessoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=25&price_bucket=1']")
    public WebElement under25;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1']")
    public WebElement between25_50;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=50&max=100&price_bucket=1']")
    public WebElement between50_100;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']")
    public WebElement over100;

    @FindBy(xpath = "//input[@value='100_']")
    public WebElement over100Radio;

    @FindBy(id = "ship_to_select")
    public WebElement shipTo;                   //WebElement is only one element

    @FindBy (id="a")
    public List<WebElement>elementList;         //List will return list of the .... [id ]is not always unique so it might return list of other id's.

    @AfterTest
    public void tearDown(ITestResult result)throws IOException {

        if (result.getStatus()== ITestResult.FAILURE){

            long timestamp=System.currentTimeMillis();

            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src,new File("src/test/screenshots/"+timestamp+ ".jpg"));
        }
        driver.close();
    }






































}
