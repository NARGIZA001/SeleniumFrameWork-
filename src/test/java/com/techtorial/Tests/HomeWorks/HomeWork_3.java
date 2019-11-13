package com.techtorial.Tests.HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork_3 {
    /*

     public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.etsy.com"); // how can print out <siteName> title is <title>
        System.out.println(driver.getTitle());
        WebElement signIn= driver.findElement(By.xpath("//a[text()='Register']"));
        signIn.click();


    }*/

   /*
   public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.ipsy.com"); // how can print out <siteName> title is <title>
        System.out.println(driver.getTitle());
        WebElement login= driver.findElement(By.xpath("//*[@id='login-splash-button']"));
        login.click();
        WebElement userName= driver.findElement(By.xpath("//*[@id='login_username']"));
        userName.sendKeys("naki");
    }*/

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.fiverr.com"); // how can print out <siteName> title is <title>
        System.out.println(driver.getTitle());
        WebElement Search= driver.findElement(By.xpath("/*[@id='main-wrapper']/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/form/input"));
        Search.sendKeys("photo shop");





    }
}
