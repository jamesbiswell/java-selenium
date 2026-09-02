package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElementsTest extends BaseTest {
    @Test
    public void interactingWithWebElementsTest() {


        waitInSeconds(2);
        // click on "Registration Form" link
        driver.findElement(By.linkText("Registration Form")).click();

        // verify page heading
        boolean isHeading = driver.findElement(By.xpath("//h1[text()='User Registration Form']")).isDisplayed();
        System.out.println("Is Registration Form heading present: " + isHeading);
        waitInSeconds(2);

        // send full name to "Full Name" text field
        driver.findElement(By.id("fullName")).sendKeys("Jeeva Thakur");
        waitInSeconds(2);

        // send password to "Password" field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Jee");
        waitInSeconds(2);

        // submit the Registration form
        passwordField.submit();
        waitInSeconds(2);

        // clear the "password" field
        passwordField.clear();
        waitInSeconds(2);

        // send valid password to "Password" field
        passwordField.sendKeys("password!");
        waitInSeconds(2);

        // submit again
        passwordField.submit();
        waitInSeconds(2);

    }
}
