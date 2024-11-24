package com.example.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameter {
    @Parameters("url")
    @Test
    void first(String url){
        System.out.println("this from XML " + url);
    }
    @Parameters("url")
    @Test
    void second(String url){
        System.out.println("i am second from" + url);
    }
}
