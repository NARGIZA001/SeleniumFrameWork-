package com.techtorial.Tests.HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BonanzaHomeWork {

    WebDriver driver;

    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @Test
    public void bonanzaSearch() throws InterruptedException{
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.bonanza.com/'");
        driver.getTitle();

        String title= js.executeScript("return document.title").toString();
        System.out.println("My page's title is : " + title);

        js.executeScript("document.getElementById('q_search_term').value='nike women';");

        WebElement button=driver.findElement(By.id("home_search_box"));

        button.click(); // shorter way to click without argument

        js.executeScript("window.scrollBy(0,700)"); // goes all the way down

        Thread.sleep(5000);

        WebElement item=driver.findElement(By.cssSelector("#item-777681342"));

        item.click();

        WebElement cart=driver.findElement(By.cssSelector("#add_to_cart"));

        cart.click();

        WebElement goCart=driver.findElement(By.cssSelector(".go_to_cart_container"));

        goCart.click();

        WebElement alert = driver.findElement(By.cssSelector("document.getElementById('.checkout_zip').value='nargiza';")); // <button onclick="jsAlert()"

       // alert.click();

        //js.executeScript("document.getElementById('.checkout_email').value='nargiz157@gmail.com';");










    }
}
