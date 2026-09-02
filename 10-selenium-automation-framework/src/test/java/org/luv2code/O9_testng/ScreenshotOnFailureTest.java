package org.luv2code.O9_testng;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ScreenshotOnFailureTest extends BaseTest {
    @Test
    public void screenshotOnFailureTest() {
        // Click on "Authentication" link
        driver.findElement(By.linkText("Authentication")).click();

        // Check presence of "Authentication" heading
        driver.findElement(By.xpath("//h1[text()='Authentication']")).isDisplayed();

        // Check presence of "Welcome!" heading
        driver.findElement(By.xpath("//h1[text()='Welcome!']")).isDisplayed();

        // Send username to Username text field
        driver.findElement(By.id("username")).sendKeys("user");

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
