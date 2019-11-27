package com.techtorial.Tests.Cookies;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies1 {

    @Test
    public void getCookies(){

        Cookie cookie=new Cookie ("1P_JAR", "2019-11-17-22");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().addCookie(cookie);
    }
}
