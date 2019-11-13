package com.techtorial.Tests.WindowHandle;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopups {

    @Test

    public void Popups(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");

        WebElement alertLink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']")); // <button onclick="jsAlert()"

        alertLink.click();

        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']")); // <button onclick="jsAlert()"

        alertButton.click();

        driver.switchTo().alert().accept(); // switch does switch to new window  which is alert and accept will do the accept part



    }

    @Test

    public void Popups_Two(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1
        driver.get("http://the-internet.herokuapp.com");

        WebElement alertLink = driver.findElement(By.xpath("//a[@href='/javascript_alerts']")); // <button onclick="jsAlert()"

       alertLink.click(); // simple pop up window just accept the window


        //2
        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")); // <button onclick="jsAlert()"

        alertButton.click(); // confirm pop up window --> you will dismiss it .

        driver.switchTo().alert().dismiss();


        //3
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")); // <button onclick="jsAlert()"

        alert3.click();

        driver.switchTo().alert().sendKeys("Hello"); // Prompt pop up window you will enter the value

        driver.switchTo().alert().accept();


    }

}
