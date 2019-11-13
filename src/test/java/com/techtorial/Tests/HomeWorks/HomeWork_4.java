package com.techtorial.Tests.HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.testng.annotations.Test;


public class HomeWork_4 {
    @Test

    public void getPrime (){

        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
        searchfield.sendKeys("iPhone"+ Keys.ENTER);
        WebElement findPrime=driver.findElement(By.xpath("(//i[@aria-label='Amazon Prime'])"));
        System.out.println(findPrime);
    }

    @Test

    public void getLaptopPrice(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchField=driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("laptop"+ Keys.ENTER);
        List<WebElement> priceElements =driver.findElements(By.xpath("(//span[@class='a-price-whole'])"));

            int sum=0;
            for (WebElement c: priceElements){
            String str=c.getText(); // now we need to get the WebElement as string
            str=str.replace(",","");
            int price=0;
            if(str.length()>0){
            price=Integer.parseInt(str);}
            sum=sum+price;
        }
        System.out.println(sum +" :: " +priceElements.size());
      }

}

/*
      @Test

    public void getLaptopPriceSum(){
          public static int findSecondMax (int [] arr) {

              if (arr.length < 2) return 0;

              // assumption of positivite numbers

              int maxNum = arr[0], secondMax = arr[0]; // ZEROS are the positive numbers.

              for (int i : arr) {
                  if (i > maxNum) {
                      secondMax=maxNum;    // assigning the last maxNumber to the secondLast number will make sure you are getting the last second max number in Array
                      maxNum = i;          //now maxNUm would be assigned to the every MaxNum .

                  } else if (i < maxNum && i > secondMax) secondMax = i;

              }
              return secondMax;
          }


      }*/













    /*
        List<WebElement> elements=new ArrayList<>();
        elements.addAll(driver.findElements(By.xpath("(//span[@class='a-price-whole'])")));
        System.out.println(elements.size());
        int sum=0;
        for(WebElement c: elements){
        String str=c.getText();
        str=str.replace(",","");
        int price=0;
        if(str.length()>0){
        price=Integer.parseInt(str);}
        sum=sum+price;
        }
        System.out.println(sum);
        <i class="a-icon a-icon-prime a-icon-medium" role="img" aria-label="Amazon Prime"></i>


        String prime=findPrime.getText();
       Assert.assertTrue(prime.toLowerCase().contains("prime"));
       //List<WebElement> priceElements=new ArrayList<WebElement>();
    */


