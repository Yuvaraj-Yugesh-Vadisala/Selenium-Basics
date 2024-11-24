package com.example.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optinal_parameter {

    @Parameters("Var")
    @Test
    void first(@Optional("(i am from first method)") String Var)
    {
        System.out.println("this is not from xml " + Var);
    }
}
