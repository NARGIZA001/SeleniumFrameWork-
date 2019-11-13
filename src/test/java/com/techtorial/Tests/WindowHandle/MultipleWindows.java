package com.techtorial.Tests.WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindows {

    @Test

    public void Popups_Two() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to the web page

        driver.get("http://the-internet.herokuapp.com");


        // the click on window link
        WebElement multiWindow = driver.findElement(By.xpath("//a[@href='/windows']")); // <button onclick="jsAlert()"
        multiWindow.click();
        String orgwinHandle = driver.getWindowHandle();


        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']")); //<a href="/windows/new" ,="" target="_blank">Click Here</a>
        clickHere.click();
        // then we click on new page link
        Set <String> setOfwindows= driver.getWindowHandles();

        String secondwinOfwindows="";

        for (String datahandle : setOfwindows){
            if (!datahandle.equalsIgnoreCase(orgwinHandle)){
                secondwinOfwindows=datahandle;

            }
        }

        driver.switchTo().window(secondwinOfwindows);

        WebElement nwText = driver.findElement(By.xpath("//h3[.='New Window']")); //<a href="/windows/new" ,="" target="_blank">Click Here</a>

        System.out.println(nwText.getText());



        driver.switchTo().window(orgwinHandle);

        WebElement clickHere2 = driver.findElement(By.xpath("//a[@href='/windows/new']"));//<a href="/windows/new" ,="" target="_blank">Click Here</a>
        clickHere2.click();

        Set <String> setOfwindowsThree= driver.getWindowHandles();

        String windowsThree="";

        for (String datahandle : setOfwindowsThree){

            if (!datahandle.equalsIgnoreCase(orgwinHandle) && !datahandle.equalsIgnoreCase(secondwinOfwindows)){

               windowsThree=datahandle;
            }
        }

        System.out.println(" ::: " + windowsThree);





    }
}

