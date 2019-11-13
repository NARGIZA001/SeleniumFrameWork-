package com.techtorial.Tests.TestNgPractice;

import org.testng.annotations.*;

public class TestNG_Annotations {
    @Test (priority = 1)
    public void test2(){
        System.out.println("This is test1");
    }

    @Test(priority = 2)
    public void test1(){
        System.out.println("This is test2");
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
        System.out.println("This is after class");
    }
}
