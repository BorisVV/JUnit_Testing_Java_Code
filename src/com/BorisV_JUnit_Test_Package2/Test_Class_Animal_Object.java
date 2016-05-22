package com.BorisV_JUnit_Test_Package2;

/*
This test classes are all in the same packages, I did find that there is a JUnit Test Set that can
can be used to have one Test Class check multiple methods in one class, I will get back to it
it I have time, since I am working on other assignment as well, I want to advance in the others
as well.
 */

import org.junit.Assert;
import org.junit.Test;

public class Test_Class_Animal_Object {
          /*
            Here the class Test_Class_Animal_Object will run and inspect the Animal
            class and methods to make sure that it works. (getName method)
         */

    @Test
    public void shouldCreateAndGetName() {
        String name = "Kitty";
        Animals_Examples ae = new Cat(name);
        Assert.assertTrue("REMOVE 'Hello' FROM THE getName METHOD IN ANIMALS CLASS ", ae.getName().equals(name));
        //The message is for the programmer to know where the error is happening.
        //In the Animals class (getName) method I added "Hello " to make this code fail
        //remove it and just live 'name' and should work just fine.
    }

}
