package com.BorisV_JUnit_Test_Package3;

public class InfiniteLoop {


    /*
        In this example the application will be an infinite loop, to test it,
        check the test class in this package and notice the red error message.
        And for this reason the use of timeout (Timer class) is used to run the
        application and runs for only a set time, then it throws the error, making it safer
        to run the application and not knowing that is an infinite loop.
     */

    public static int loop(int one) {
        while (one == 1) {
            one = 1;
            /*  I know that is not right but this is to test the method
                and by mistake put a number that will make the loop infinite.
            */

        }
        return 2;
        //This will make the while loop infinite.
    }


}
