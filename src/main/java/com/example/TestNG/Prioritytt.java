package com.example.TestNG;

import org.testng.annotations.Test;

public class Prioritytt {

    @Test(priority=0)
    void testone(){
        System.out.println("this should print first");
    }

    @Test(priority=1)
    void testtwo(){
        System.out.println("this should print second");
    }

    @Test(priority=2)
    void testthree(){
        System.out.println("this should print third");
    }

    @Test(priority=3,enabled = false)
    void testfour(){
        System.out.println("this should print last");
    }
}
