package org.luv2code.O9_testng;

import org.testng.annotations.Test;

public class FirstTestngTest {

//    @Test(priority = 1)
    @Test
    public void openApplication() {
        System.out.println("Step 1: Launch Application");
    }

//    @Test(priority = 2)
    @Test(dependsOnMethods = "openApplication")
    public void loginTest() {
        System.out.println("Step 2: Perform Login");
    }

//    @Test(priority = 3)
    @Test(dependsOnMethods = "loginTest")
    public void logoutTest() {
        System.out.println("Step 3: Perform Logout");
    }

}
