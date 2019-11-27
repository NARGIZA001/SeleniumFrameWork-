package com.techtorial.Tests.TestNgPractice;

import org.testng.annotations.*;

public class TestNG_Annotations {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("this will be executed before suite ");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("this will be executed after suite ");
    }

    @BeforeTest
    public void beforeTets(){
        System.out.println("this will be executed before test ");
    }
    @AfterTest
    public void afterTest1(){
        System.out.println("this will be executed after test");
    }
    @Test (priority = 1)
    public void test2(){
        System.out.println("This is test1");
    }

    @Test(priority = 2, alwaysRun = true) // true will run or false
    public void test1(){
        System.out.println("This is test2");
    }

    @Test(priority = 3, enabled=false) // true  will run or false
    public void test3(){
        System.out.println("This is test3");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method ");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("This is after method ");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is  after class");
    }
}
