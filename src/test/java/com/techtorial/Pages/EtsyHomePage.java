package com.techtorial.Pages;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;


public class EtsyHomePage {
    static WebDriver driver;

    @BeforeClass
    public void setup(){
        driver =Utils_DRY.driverSetup("chrome");
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="global-enhancements-search-query")
    WebElement searchField;

    @FindBy(id="register")
    WebElement register;

    @FindBy(xpath="//span[@id='gnav-header-inner']/div[4]/ul/li[4]/a/span[1]")
    WebElement cart;


}
