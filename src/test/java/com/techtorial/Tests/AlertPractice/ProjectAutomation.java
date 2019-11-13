package com.techtorial.Tests.AlertPractice;

import com.techtorial.UTILS.Utils_DRY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class ProjectAutomation {
    WebDriver driver;

    /**
     * /input[@id="car-pickup-hp-car"]
     * picking up car
     * //input[@id="car-dropoff-hp-car"]
     * droping off car
     * pick up date
     * //input[@id="car-pickup-date-hp-car"]
     * pick up time
     * //select[@id="car-pickup-time-hp-car"]
     * drop off date
     * //input[@id="car-dropoff-date-hp-car"]
     * drop off time
     * //select[@id="car-dropoff-time-hp-car"]
     */

    @BeforeClass
    public void setUp (){

        driver =Utils_DRY.driverSetup("chrome ");

    }

    @Test
    public  void Carbutton (){ //1


        driver.get("https://www.expedia.com/");

        WebElement car = driver.findElement(By.id("tab-car-tab-hp")); //<button class="on" data-lob="car" data-section-id="#section-car-tab-hp" id="tab-car-tab-hp" type="button">
        car.click();

        WebElement pick=driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
        pick.click();
        pick.sendKeys("LAX");

        WebElement drop=driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
        drop.click();
        drop.sendKeys("SFO");








    }
    @Test
    public void PickUpDateandTime(){  //2


        driver.get("https://www.expedia.com/");//https://www.expedia.com/
        WebElement car = driver.findElement(By.id("tab-car-tab-hp")); //<button class="on" data-lob="car" data-section-id="#section-car-tab-hp" id="tab-car-tab-hp" type="button">
        car.click();

        WebElement pick=driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
        pick.click();
        pick.sendKeys("LAX");

        WebElement drop=driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
        drop.click();
        drop.sendKeys("SFO");

        WebElement dropOffdate=driver.findElement(By.xpath("//input[@id='car-dropoff-date-hp-car']"));
        dropOffdate.click();
        dropOffdate.clear();
        dropOffdate.sendKeys("12/10/2019");

        WebElement pickdate=driver.findElement(By.xpath("//input[@id='car-pickup-date-hp-car']"));
        pickdate.click();
        pickdate.clear();
        pickdate.sendKeys("12/5/2019");

        WebElement dropOfTime=driver.findElement(By.xpath("//select[@id='car-dropoff-time-hp-car']"));
        Select dtimeSelect = new Select(dropOfTime);
        dtimeSelect.selectByVisibleText("12:00 pm");


        WebElement pickUpTime=driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
        Select ptimeSelect = new Select(pickUpTime);
        ptimeSelect.selectByVisibleText("10:00 am");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());



    }

    @Test
    public void PickUpDateandTimeAndSearch(){ //3


        driver.get("https://www.expedia.com/");//https://www.expedia.com/
        WebElement car = driver.findElement(By.id("tab-car-tab-hp")); //<button class="on" data-lob="car" data-section-id="#section-car-tab-hp" id="tab-car-tab-hp" type="button">
        car.click();

        WebElement pick=driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
        pick.click();
        pick.sendKeys("LAX");

        WebElement drop=driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
        drop.click();
        drop.sendKeys("SFO");

        WebElement dropOffdate=driver.findElement(By.xpath("//input[@id='car-dropoff-date-hp-car']"));
        dropOffdate.click();
        dropOffdate.clear();
        dropOffdate.sendKeys("12/10/2019");

        WebElement pickdate=driver.findElement(By.xpath("//input[@id='car-pickup-date-hp-car']"));
        pickdate.click();
        pickdate.clear();
        pickdate.sendKeys("12/5/2019");

        WebElement dropOfTime=driver.findElement(By.xpath("//select[@id='car-dropoff-time-hp-car']"));
        Select dtimeSelect = new Select(dropOfTime);
        dtimeSelect.selectByVisibleText("12:00 pm");


        WebElement pickUpTime=driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
        Select ptimeSelect = new Select(pickUpTime);
        ptimeSelect.selectByVisibleText("10:00 am");


        WebElement searchField=driver.findElement(By.xpath("//button[@id='gcw-submit-car']"));
        searchField.click();



    }

    @Test
    public void SearchPage() throws InterruptedException { //4


        driver.get("https://www.expedia.com/");//https://www.expedia.com/

        String window_1 = driver.getWindowHandle();

        WebElement car = driver.findElement(By.id("tab-car-tab-hp")); //<button class="on" data-lob="car" data-section-id="#section-car-tab-hp" id="tab-car-tab-hp" type="button">
        car.click();

        WebElement pick=driver.findElement(By.xpath("//input[@id='car-pickup-hp-car']"));
        pick.click();
        pick.sendKeys("LAX");

        WebElement drop=driver.findElement(By.xpath("//input[@id='car-dropoff-hp-car']"));
        drop.click();
        drop.sendKeys("SFO");

        WebElement dropOffdate=driver.findElement(By.xpath("//input[@id='car-dropoff-date-hp-car']"));
        dropOffdate.click();
        dropOffdate.clear();
        dropOffdate.sendKeys("12/10/2019");

        WebElement pickdate=driver.findElement(By.xpath("//input[@id='car-pickup-date-hp-car']"));
        pickdate.click();
        pickdate.clear();
        pickdate.sendKeys("12/5/2019");

        WebElement dropOfTime=driver.findElement(By.xpath("//select[@id='car-dropoff-time-hp-car']"));
        Select dtimeSelect = new Select(dropOfTime);
        dtimeSelect.selectByVisibleText("12:00 pm");


        WebElement pickUpTime=driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
        Select ptimeSelect = new Select(pickUpTime);
        ptimeSelect.selectByVisibleText("10:00 am");


        WebElement searchField=driver.findElement(By.xpath("//button[@id='gcw-submit-car']"));
        searchField.click();

        Thread.sleep(5000);

        WebElement reserve =driver.findElement(By.xpath("(//a[contains(@href, '/carsearch/')])[1]"));
        reserve.click();



        Set<String> setOfwindows= driver.getWindowHandles();

        String window_2="";

        for (String datahandle : setOfwindows){

            if (!datahandle.equalsIgnoreCase(window_1)){

                window_2=datahandle;
            }
        }
        Thread.sleep(5000);

        driver.switchTo().window(window_2);

        WebElement reserveCar =driver.findElement(By.xpath("(//a[contains(@href,'/carsearch/book')])[1]"));
        reserveCar.click();

        ////input[@class='cko-field single-name-field gb-whitelist primary-traveler']

        WebElement firstName =driver.findElement(By.xpath("//input[@class='cko-field single-name-field gb-whitelist primary-traveler']"));
        firstName.sendKeys("Diana Singer");

       // WebElement country=driver.findElement(By.xpath("//select[@id='car-pickup-time-hp-car']"));
       // Select countrySelect = new Select(country);
       // countrySelect.selectByVisibleText("United States of America +1");

        ////input[@class='text cko-field always-include gb-whitelist']

        WebElement phone =driver.findElement(By.xpath("//input[@class='text cko-field always-include gb-whitelist']"));
        phone.sendKeys("123456789");


    }
}

//        WebElement returnDate = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
//        returnDate.sendKeys("01/01/2020");
//        WebElement departure = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
//        departure.sendKeys("11/01/2019");
//        returnDate.click();
//        WebElement search = driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']"));
//        search.click();
//
//        System.out.println(driver.getTitle());
//Actions actions=new Actions(driver);
/*

        Set<String> setOfwindows= driver.getWindowHandles();

        String window_2="";

        for (String datahandle : setOfwindows){

            if (!datahandle.equalsIgnoreCase(window_1)){

                window_2=datahandle;
            }
        }

        driver.switchTo().window(window_2);
        //driver.get("https://www.expedia.com/carsearch");//https://www.expedia.com/*/

//String window_1 = driver.getWindowHandle();
