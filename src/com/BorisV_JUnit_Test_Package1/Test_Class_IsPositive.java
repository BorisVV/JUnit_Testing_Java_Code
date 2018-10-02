package com.BorisV_JUnit_Test_Package1;

import org.junit.Test;

//import static org.testng.AssertJUnit.assertEquals;
//The option above is the same as the one below, just takes more arguments.
import static org.testng.AssertJUnit.assertTrue;

public class Test_Class_IsPositive {
    /*
        This class is to test that the input is a positive number.
     */

    @Test
    //This is the method used to throw an exception, and to use the JUnit to test the code.
    public void positive() throws Exception {
        IsPositive_Numbers positive = new IsPositive_Numbers();
        boolean result = positive.positive(5);
        //The assetEquals is the same as the assertTrue.
//        assertEquals("Needs to be positive ", true, result);
        assertTrue("Needs a positive number", result); // The message is only displayed if the test fails.
        //Another option is just one argument for assertTrue, without the message.
//        assertTrue(result);

        //Just change the parameter to (5) to make the code run ok (green).
    }
}