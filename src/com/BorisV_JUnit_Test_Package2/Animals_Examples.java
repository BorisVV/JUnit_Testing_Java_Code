package com.BorisV_JUnit_Test_Package2;

/*
    This class is to set Object named for example "Kitty" the Cat, and then return the name
    but to test and see that it works, I created a test Class to test it first.
 */
public abstract class Animals_Examples {

    private String name;

    Animals_Examples(String name) {
        this.name = "Hello " + name;
    }

    public String getName() {
        return name;
    }

    //if noting is change in the Animals class the application should run without a problem.
    public static void main(String[] args) {
        Animals_Examples catName = new Cat("Kitty");
        System.out.println("The name of the new Cat is: " + catName.getName());


    }


}
