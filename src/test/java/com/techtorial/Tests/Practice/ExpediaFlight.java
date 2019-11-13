package com.techtorial.Tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaFlight {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();




        // WebDriver is interface and ChromeDriver () is a regular class

        driver.get("https://www.expedia.com");

        WebElement flightTab=driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']"));
        flightTab.click();

        //driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']")).click();
        //driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();

        WebElement flyingFrom =driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));

        //flyingFrom.click(); NO NEED TO USE CLICK () METHOD WHEN SENDING KEY
        flyingFrom.sendKeys("Chicago");

        WebElement flyingTo =driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));

        //flyingFrom.click(); NO NEED TO USE CLICK () METHOD WHEN SENDING KEY
        flyingTo.sendKeys("New York");



        WebElement returning =driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returning.sendKeys("11/5/2019");

        WebElement departing =driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departing.sendKeys("10/29/2019");

        returning.click();
        WebElement search=driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']"));
        search.click();


        driver.quit();
        driver.getTitle();














    }

}
