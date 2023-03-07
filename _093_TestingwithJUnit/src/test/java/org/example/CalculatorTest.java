package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canAddNumbers(){ // naming convention

        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;

        int result = underTest.add(number1,number2);

        assertEquals(30,result); // we are expecting 30, is the result same ?

        // TEST IS COMPLETE AND PASSED
    }
    @Test
    void canHandleWhenInputIsZero(){

        Calculator underTest = new Calculator();

        var result = underTest.add(0);
        assertEquals(0,result);
    }

    @Test
    @DisplayName("foo")
    void canAddNumbersFromGivenArray(){ // Be descriptive as you can, This test works too!

        Calculator underTest = new Calculator();
        var numbers = new int[]{1,5,3};

        var result = underTest.add(numbers);
        assertEquals(9,result);
    }





}
