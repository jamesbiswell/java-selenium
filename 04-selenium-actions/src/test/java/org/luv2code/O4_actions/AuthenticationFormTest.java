package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AuthenticationFormTest extends BaseTest {
    @Test
    public void authenticationFormTest() {

        // Click on "Authentication" link
        driver.findElement(By.linkText("Authentication")).click();

        // Check presence of "Authentication" heading
        driver.findElement(By.xpath("//h1[text()='Authentication']")).isDisplayed();

        // Check presence of "Welcome!" heading
        driver.findElement(By.xpath("//h1[text()='Welcome!']")).isDisplayed();

        // Send username to Username text field
        driver.findElement(By.id("username")).sendKeys("admin");

        // Send password to Password text field
        driver.findElement(By.id("password")).sendKeys("admin");

        // Click on "Sign In" button
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Check presence of "Login Successful" heading
        driver.findElement(By.xpath("//h2[contains(text(), 'Login Successful')]"));
        waitInSeconds(2);

        // click on "Logout" button
        driver.findElement(By.xpath("//button[text()='Logout']")).click();
        waitInSeconds(2);

        // Check presence of "Welcome!" heading
        driver.findElement(By.xpath("//h1[text()='Welcome!']"));
        waitInSeconds(2);


    }
}
