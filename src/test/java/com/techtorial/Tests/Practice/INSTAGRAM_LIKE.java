package com.techtorial.Tests.Practice;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class INSTAGRAM_LIKE {

    WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome ");

    }

/*
    @Test
    public void instaPage() throws InterruptedException {

        driver.get("https://www.instagram.com/");
        Thread.sleep(4000);
        WebElement instaLogin=driver.findElement(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']"));
        instaLogin.click();
        Thread.sleep(4000);
        WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("m3rv3s3n3l@gmail.com");
        Thread.sleep(3000);
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("");
        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
        Thread.sleep(4000);
        WebElement notify=driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']"));
        notify.click();
//*[@id="react-root"]/section/main/section/div[2]/div[1]/div/article[2]/div[2]/section[1]/span[1]/button
        //Actions actions = new Actions(driver);
        Thread.sleep(4000);
        WebElement like=driver.findElement(By.xpath("//span[@class='fr66n']"));
        like.click();
        //actions.doubleClick(like).click();
//driver.close();
    }*/
}

