package com.example;

import org.testng.annotations.*;

public class Sample2 {

    @BeforeMethod
    void beforetest(){
        System.out.println("this will print before every test case");
    }

    @Test
    void test3(){
        System.out.println("this is test 3");
    }

    @Test
    void test4(){
        System.out.println("This is test 4");
    }

    @AfterMethod
    void aftertest(){
        System.out.println("this will print after every test case");
    }
    @BeforeClass
    void beforeclass(){
        System.out.println("this will print before the class");
    }

    @AfterClass
    void Afterclass(){
        System.out.println("this will print After the class");
    }


    @AfterSuite
    void AfterSuite(){
        System.out.println("this will print After the complete Suite");
    }


    @BeforeSuite
    void BeforeSuite(){
        System.out.println("this will print Before the complete Suite");
    }
}
