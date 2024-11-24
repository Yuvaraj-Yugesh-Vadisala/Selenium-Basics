package com.example.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//Dependency test,Always Run Methods

public class Depend_Run {


    @Test
    void startcar(){
        System.out.println("The car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startcar"})
    void drivecar(){
        System.out.println("The car driving");
    }

    @Test(dependsOnMethods = {"drivecar"} , alwaysRun = true)
    void stopcar(){
        System.out.println("The car stopped");
    }

    @Test(dependsOnMethods = {"drivecar","stopcar"})
    void parkcar(){
        System.out.println("The car parked");
    }
}
