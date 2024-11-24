package com.example;

import org.testng.annotations.*;

public class Sample {

    @BeforeMethod
    void beforetest(){
        System.out.println("this will print before every test case");
    }

    @Test
    void test1(){
        System.out.println("this is test 1");
    }

    @Test
    void test2(){
        System.out.println("This is test 2");
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

    @AfterTest
    void AfterTest(){
        System.out.println("this will print After the complete Test");
    }


    @BeforeTest
    void BeforeTest(){
        System.out.println("this will print Before the complete Test");
    }

}
