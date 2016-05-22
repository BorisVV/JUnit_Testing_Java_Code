package com.BorisV_JUnit_Test_Package3;

import org.junit.Test;

public class Test_Class_InfiniteLoop_Object {

    @Test (timeout = 1000)  //This timers(1000 ms) which is equal to one second will stop the loop.
    public void test() {
        int one = InfiniteLoop.loop(1);
        //The assertion is not needed in this case.
    }
}

/*
    This example was pulled from a youtube video, I found it very instructive and very useful for while loops
    that can become infinite by a mistake done by the programmer.
    https://www.youtube.com/watch?v=1M7gzXC9434
 */