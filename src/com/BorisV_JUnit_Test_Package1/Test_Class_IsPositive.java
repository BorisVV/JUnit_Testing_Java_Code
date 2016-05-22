package com.BorisV_JUnit_Test_Package1;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Test_Class_IsPositive {
    /*
        This class is to test that the input is a positive number.
     */

    @Test
    //This is the method used to throw an exception, and to use the JUnit to test the code.
    public void positive() throws Exception {
        IsPositive_Numbers positive = new IsPositive_Numbers();
        boolean result = positive.positive(-5);
        assertEquals("Needs to be positive ", true, result);

        //Just change the parameter to (5) to make the code run ok (green).
    }
}