package com.techtorial.Tests.HeadlessDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HeadLessIntro {

    @Test
    public void capabilities(){
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"myspecialBrowser");
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,Platform.MAC);
        desiredCapabilities.setCapability(CapabilityType.VERSION,"5.7");

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME,"mySpecialBrowser");
      //  chromeOptions.setCapability(CapabilityType.PLATFORM_NAME);

        WebDriver driver=new ChromeDriver(desiredCapabilities);

    }

    @Test
    public void setHtmlUnitDriver(){

        WebDriver driver=new HtmlUnitDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }

    @Test

    public void setPhanton(){

        WebDriverManager.phantomjs().setup();
        WebDriver driver=new PhantomJSDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }

}
