package com.techtorial.Tests.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownIntro {


    @Test

    public void dropDown(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement searchDrop=driver.findElement(By.id("searchDropdownBox"));

        Select amazonSelect=new Select(searchDrop); // you must provide the WebElement

        amazonSelect.selectByVisibleText("Electronics");

        amazonSelect.selectByIndex(4);

        amazonSelect.selectByValue("");


    }

    @Test
    public void SelectDropDown(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement searchDrop=driver.findElement(By.xpath("//a[@href='/dropdown']"));


       // <a href="/dropdown">Dropdown</a>

        searchDrop.click();

        Select optionSelect= new Select(searchDrop);

       optionSelect.selectByIndex(2);


      // optionSelect.selectByVisibleText("Option 2");


    }
    @Test
            public void getallOPtions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement searchDrop=driver.findElement(By.id("searchDropdownBox"));

        Select amazonSelect=new Select(searchDrop);

        List<WebElement> allOPtions = amazonSelect.getOptions();
        int i=0;

        for (WebElement w : allOPtions){

            System.out.println(++i + " : "+ w.getText());

        }

    }

    @Test
    public void CheckBoxesRadioButton() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");

        WebElement checkbox = driver.findElement(By.xpath("//a[@href='/checkboxes']"));

        checkbox.click();

        Select optionSelect = new Select(checkbox);

        optionSelect.selectByVisibleText("Checkbox 1");

        WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());

        List<WebElement> checkList=driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));

        for( WebElement checkBox: checkList){
            if (!checkBox.isSelected()){
                checkBox.click();
            }
        }

    }
}
