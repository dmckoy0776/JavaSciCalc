package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.Assert;
import org.junit.Test;

public class BasicFunctionTest {
    @Test
    public void testAdd() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 =  7;
        double input2 = 6;
        double expected = 13.0;

        //When
        double actual = addTest.addIt(input1,input2);
        //Then

        Assert.assertEquals(expected,actual,0.001);
    }
    @Test
    public void testSubtract() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 = 18;
        double input2 = 7;
        double expected = 11;

        //When
        double actual = addTest.subtractIt(input1, input2);
        //Then

        Assert.assertEquals(expected, actual, 0.001);

    }
    @Test
    public void testMultiply() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 = 5;
        double input2 = 8;
        double expected = 40;

        //When
        double actual = addTest.multiplyIt(input1, input2);
        //Then

        Assert.assertEquals(expected, actual, 0.001);

    }
    @Test
    public void testDivide() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 = 25;
        double input2 = 5;
        double expected = 5;

        //When
        double actual = addTest.divideIt(input1, input2);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void squareTest() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input = 6 ;
        double expected = 36;

        //When
        double actual = addTest.squareIt(input);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void squareRtTest() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input = 16;
        double expected = 4;

        //When
        double actual = addTest.squareRootIt(input);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void inverseTest() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input = 16;
        double expected = 0.0625;

        //When
        double actual = addTest.inverseIt(input);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void changeSignTest() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input = 28;
        double expected = -28;

        //When
        double actual = addTest.changeSigns(input);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void expoTest() {
        //Given
        BasicFunctions addTest = new BasicFunctions();
        double input1 = 4;
        double input2 = 3;
        double expected = 64;

        //When
        double actual = addTest.powerExponent(input1, input2);
        //Then

        Assert.assertEquals(expected, actual, 0.001);
    }

}
