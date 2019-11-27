package com.techtorial.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMPage {

    // without Pagefactory.initElements method, your will not be initialized.
    // It means you can not use your elements.
//    WebDriver driver;

    public OrangeHRMPage(WebDriver driver) {
//        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // I want to store my elements

    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(className = "page-title")
    public WebElement pagetitel;

    @FindBy(id="user-dropdown")
    public WebElement dropDownButton;

    @FindBy(id="logoutLink")
    public WebElement logOutButton;

    @FindBy (className="dashboardCard-title-for-card")
    public  WebElement reTry;
}
