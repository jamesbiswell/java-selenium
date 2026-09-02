package org.luv2code.O9_testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestngTest {
    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("\nLogging in with Username: " + username + " and Password: " + password);

    }
}
