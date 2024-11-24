package com.example.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Assertion {
    WebDriver driver = new ChromeDriver();
    @Test(priority = 1)
    void setup(){
        driver.get("https://www.javatpoint.com/");
        String Actual="Tutorials List bbjbnb- Javatpoint";
        String Expected = driver.getTitle();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actual,Expected,"Title mismatch");
        sa.assertAll();
    }
    @Test(priority = 2)
    void Logo(){
      WebElement logo =  driver.findElement(By.xpath("//*[@id=\"headerpage\"]/table/tbody/tr/td/div[1]/a/img"));
      boolean status =logo.isDisplayed();
      assertTrue(status);
      driver.quit();
    }
}
