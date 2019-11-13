package com.techtorial.Tests.HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomeWork_5 {

    @Test
    public void Select_Ten(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kayak.com");

        WebElement select = driver.findElement(By.xpath("//select[@id='pMu7-anymonth-select']"));

        select.click();

        Select optionSelect = new Select(select);

        optionSelect.selectByVisibleText("12/13/2019");



    }


    @Test
    public void Select_Tentwo(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/?ref=lgo");

        WebElement select = driver.findElement(By.id("catnav-primary-link-10855"));

        select.click();

        WebElement selectState = driver.findElement(By.id("ship_to_select"));

        selectState.click();

        Select optionState =new Select(selectState);

        optionState.selectByVisibleText("Spain"); // 1__DropDown


    }

}
