package com.techtorial.Tests.HomeWorks;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {
    @Test

     public void iphoneSearchtest(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");


        System.out.println(driver.getTitle());

        WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox")); // if the id is unique then just use BY.id () method
        searchfield.sendKeys("iphone" + Keys.ENTER);

//        WebElement input=driver.findElement(By.xpath("//input[@class='nav-input']"));
//        input.click();

        WebElement productTitle = driver.findElement(By.xpath("//span[.='Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray']"));
        String productName = productTitle.getText();
        System.out.println(productName.toLowerCase().contains("iphone"));


        // driver.get("https://www.amazon.com");
        //  WebDriverManager wholefoods=driver.findElement(By.className("")).click();

        Assert.assertTrue(productName.toLowerCase().contains("iphone"));


    }

    @Test

    public void getPrice (){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox")); // if the id is unique then just use BY.id () method
        searchfield.sendKeys("phone" + Keys.ENTER);


        WebElement findPrice= driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
        String prime = findPrice.getText();
        Assert.assertTrue(prime.toLowerCase().contains("prime"));



    }
}

