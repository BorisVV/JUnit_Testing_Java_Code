package com.BorisV_JUnit_Test_Package1;

public class IsPositive_Numbers {

    //Returns true if a number is greater or equal to zero
    protected boolean positive(int input) {

        if (input > 0 ) {
            return true;
        } else
            return false;
        /*If the number is greater than zero = true, else if the number is negative
        or zero = false.
        Run the class Test_Class_IsPositive to test it.
        */
    }


    /*
        This method below if for doing concatenation and should add to strings
        without an error, there is a class for this method to test it call
        Test_Class_Concatenation.
     */
    public String conCat(String a, String b) {
        return a + b;
    }

}

