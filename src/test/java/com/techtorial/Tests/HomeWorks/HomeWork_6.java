package com.techtorial.Tests.HomeWorks;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork_6 {

    WebDriver driver;

    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome ");

    }

    @Test

    public void DragDropA(){

        Actions actions=new Actions(driver);
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement drag = driver.findElement(By.id("fourth")); ///drag_and_drop ___5000 to account
        drag.click();
        WebElement drop =driver.findElement(By.id("amt7"));
        actions.dragAndDrop(drag,drop).perform();
    }

    @Test

    public void DragDropB(){

        Actions actions=new Actions(driver);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement drag = driver.findElement(By.id("credit2")); //BANK TO
        drag.click();
        WebElement drop =driver.findElement(By.id("shoppingCart1")); // ACCOUNT
        actions.dragAndDrop(drag,drop).perform();
    }
    @Test

    public void DragDropC(){

        Actions actions=new Actions(driver);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement drag = driver.findElement(By.id("credit1")); //SALES  TO
        drag.click();
        WebElement drop =driver.findElement(By.id("shoppingCart3")); // ACCOUNT
        actions.dragAndDrop(drag,drop).perform();
    }

    @Test

    public void DragDropD(){

        Actions actions=new Actions(driver);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement drag = driver.findElement(By.id("fourth")); //SALES  TO
        drag.click();
        WebElement drop =driver.findElement(By.id("shoppingCart4")); // ACCOUNT
        actions.dragAndDrop(drag,drop).perform();

      //   HOW CAN I CONTINUE , MY THREAD SLEEP DOESN'T WORK
    }

    @Test
    public void RightClick (){

        Actions actions=new Actions(driver);

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement context = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));// <span class="context-menu-one btn btn-neutral">right click me</span>

        actions.contextClick(context).perform();

    }

    @Test
    public void  AlertandWindowHandle  (){

        Actions actions=new Actions(driver);

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement alert = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));// <button ondblclick="myFunction()">Double-Click Me To See Alert</button>
        actions.doubleClick(alert).perform();
        driver.switchTo().alert().accept();


    }




}

