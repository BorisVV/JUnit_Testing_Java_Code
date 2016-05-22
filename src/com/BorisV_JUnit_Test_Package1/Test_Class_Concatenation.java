package com.BorisV_JUnit_Test_Package1;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Test_Class_Concatenation {
    /*
        This class is to test that the input is a concatenation.
    */

    //This is the method used to throw an exception, and to use the JUnit to test the code.

    @Test
    public void conCat() {
        IsPositive_Numbers junit = new IsPositive_Numbers();
        String result = junit.conCat("Hello", "World");
        assertEquals("HelloWorld", result);
        //This code pass, the "HelloWorld" is correct in the assertEquals line.
        //change the assertEquals line to "HellWord" to see that it throws an error.
    }
}