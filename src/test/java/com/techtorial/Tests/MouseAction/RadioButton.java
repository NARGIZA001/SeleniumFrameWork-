package com.techtorial.Tests.MouseAction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
    @Test
    public void prcticeCheckBoxRadio(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.toolsqa.com/automation-practice-form/");

        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));  //<input name="firstname" type="text">
        firstName.sendKeys("Nargiza");

        WebElement lastName= driver.findElement(By.xpath("//input[@id='lastname']"));  ////input[@id='lastname']
        lastName.sendKeys("Kenesh");

        WebElement button= driver.findElement(By.xpath("//input[@value='Female']"));  //<input id="sex-1" name="sex" type="radio" value="Female">
        button.click();

        //WebElement experience= driver.findElement(By.xpath("//input[@id='exp-2']"));  //<input id="exp-2" name="exp" type="radio" value="3">
        //experience.click();

        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']")); //<input id="datepicker" type="text">
        date.sendKeys("01/20/2019");

        WebElement proffession= driver.findElement(By.xpath("//input[@id='profession-1']")); //<input id="profession-1" name="profession" type="checkbox" value="Automation Tester">
        proffession.click();

        WebElement tool= driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));//<input id="tool-2" name="tool" type="checkbox" value="Selenium Webdriver">
        tool.click();

        //









    }
}
