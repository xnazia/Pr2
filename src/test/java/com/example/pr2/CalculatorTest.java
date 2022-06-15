package com.example.pr2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumTest1() {
        // Arrange -- Inputvariable definieren(was geben wir in unsere Methode rein)
        int a = 2;
        int b = 5;

        int expectedResult = 7;
        //Act
        int result = calculator.sum(a,b);

        //Assert
        //expected result = result ?
        assertEquals(expectedResult, result);

    }

    //---


    @Test
    void AbsoluteTest1() {
        //arrange
        int a = -2;

        int expectedResult = 2;
        //Act
        int result = calculator.absolute(a);

        //Assert
        assertEquals(expectedResult, result);
    }



  //--division test

    @Test
    void DivisionTest1() {
        //arrange
        double a = 10;
        double b = 2;

        double expectedResult = 5;
        //Act
        double result = calculator.division(a,b);

        //Assert
        assertEquals(expectedResult, result);

    }

//--division durch 0
    @Test
    void DivisionTest2() {
        //arrange
        double a = 10;
        double b = 0;

     assertThrows(ArithmeticException.class, () -> {calculator.division(a,b);

     });

    }



    @Test
    void MinusTest1() {
        //arrange
        int a = 10;
        int b = 5;

        int expectedResult = 5;
        //Act
        int result = calculator.minus(a,b);

        //Assert
        assertEquals(expectedResult, result);
    }


    @Test
    void square() {
        //arrange
        int a = 4;

        int expectedResult = 16;
        //Act
        int result = calculator.square(a);

        //Assert
        assertEquals(expectedResult, result);
    }
//--multiply

    @Test
    void multiply() {
        //arrange
        int a = 4;
        int b = 5;

        int expectedResult = 20;
        //Act
        int result = calculator.multiply(a,b);

        //Assert
        assertEquals(expectedResult, result);
    }



}