package org.luv2code.O9_testng;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedDataProviderTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
                {"admin", "admin"},
                {"user2", "pass2"},
                {"user3", "pass3"},
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Logging in with user: " + username + " and pass: " + password);
    }

    @Test(dataProvider = "loginData")
    public void loginTest2(String username, String password){
        // Click on "Authentication" link
        driver.findElement(By.linkText("Authentication")).click();

        // Check presence of "Authentication" heading
        driver.findElement(By.xpath("//h1[text()='Authentication']")).isDisplayed();

        // Check presence of "Welcome!" heading
        driver.findElement(By.xpath("//h1[text()='Welcome!']")).isDisplayed();

        // Send username to Username text field
        driver.findElement(By.id("username")).sendKeys(username);

        // Send password to Password text field
        driver.findElement(By.id("password")).sendKeys(password);

        // Click on "Sign In" button
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

}
