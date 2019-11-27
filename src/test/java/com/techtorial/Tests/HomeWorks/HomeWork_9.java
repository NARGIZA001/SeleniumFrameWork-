package com.techtorial.Tests.HomeWorks;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork_9 {

        WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =UtilsDRY.driverSetup("chrome");

    }

    @Test
    public  void AlltheElements () {



        driver.get("http://the-internet.herokuapp.com");

        WebElement mainFiled = driver.findElement(By.xpath("//div[@id='FMP-target']"));
        mainFiled.click();


        WebElement infoField = driver.findElement(By.xpath("//input[@id='lp-geocomplete']"));
        infoField.click();

        WebElement Destination = driver.findElement(By.xpath("//ul[@id='awesomplete_list_1']/preceding-sibling::input[@id='lp-geocomplete']"));
        Select selects=new Select(Destination);
        selects.selectByVisibleText("London");

        WebElement checkIn = driver.findElement(By.xpath("//form[@id='MagicCarpetSearchBar']/div[2]/div/div/div/div[1]/div[2]"));
        checkIn.sendKeys("12/20/2019");

        WebElement checkOut = driver.findElement(By.xpath("//form[@id='MagicCarpetSearchBar']/div[2]/div/div/div/div[3]/div[2]"));
        checkOut.sendKeys("12/30/2019");

        WebElement Adults = driver.findElement(By.xpath("//div[@id='lp-guestpicker']/div[1]/div[2]/div/div/div"));
        Select selectAdults=new Select(Adults);
        selectAdults.selectByIndex(4);

        WebElement Children = driver.findElement(By.xpath("//select[@id='children'][1]"));
        Select selectChildren=new Select(Children);
        selectChildren.selectByVisibleText("2");

        WebElement searchF = driver.findElement(By.xpath("//div[@id='lp-search-button'][1]"));
        searchF.click();

        WebElement AdPage = driver.findElement(By.xpath("//div[@id='js-modal-page']/div[1]/div/div[1]/div[3]/section/div[2]"));
        AdPage.click();



        //*[@id="MagicCarpetSearchBar"]/div[2]/div/input[1] ——-unique , field  entering the value
        //*[@id="MagicCarpetSearchBar"]/div[2]/div/input[2]——-unique , field  entering the value
        //input[@id="checkin_input"] ____double
        //input[@id="checkout_input"]____double
        //select[@id="adults"]   —————-adults
        //select[@id="children"][1]-------------children
        //div[@id="lp-search-button"][1]
        //div[@id="js-modal-page"]/div[1]/div/div[1]/div[3]/section/div[2] ——————landing page

    }

}
