package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestNGExample {

    @Test
    public void testAddition() {
        // Arrange
        int num1 = 5;
        int num2 = 7;
        int expectedResult = 12;

        // Act
        int result = num1 + num2;

        // Assert
        assertEquals(result, expectedResult, "Addition result is incorrect");
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int num1 = 10;
        int num2 = 4;
        int expectedResult = 6;

        // Act
        int result = num1 - num2;

        // Assert
        assertEquals(result, expectedResult, "Subtraction result is incorrect");
    }
}
