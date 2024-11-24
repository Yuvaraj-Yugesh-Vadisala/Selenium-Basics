package com.example.TestNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"group1"})
    void test1(){
        System.out.println("This is 1 group1");
    }

    @Test(groups = {"group2"})
    void test2(){
        System.out.println("This is group2");
    }

    @Test(groups = {"group1"})
    void test3(){
        System.out.println("This is 3 group1");
    }

    @Test(groups = {"group2"})
    void test4(){
        System.out.println("This is group2");
    }

    @Test(groups = {"group1"})
    void test5(){
        System.out.println("This is 5 group1");
    }
}
