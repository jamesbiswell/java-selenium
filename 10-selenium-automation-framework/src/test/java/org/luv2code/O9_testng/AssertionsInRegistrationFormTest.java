package org.luv2code.O9_testng;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInRegistrationFormTest extends BaseTest {
    @Test
    public void assertionsInRegistrationFormTest() {

        // Test Data
        String username = "Jhon Doe";
        String email = "jhon.doe@emample.com";
        String phoneNum = "0123456789";

        // click on "Registration Form" link
        driver.findElement(By.linkText("Registration Form")).click();
        waitInSeconds(1);

        // check presence of "Registration Form" heading
        highlightElement(driver.findElement(By.xpath("//h1[text()='User Registration Form']")));
        waitInSeconds(1);

        // enter full name in FullName filed
        WebElement fullNameField = driver.findElement(By.id("fullName"));
        fullNameField.sendKeys(username);
        waitInSeconds(1);

        // enter password in password filed
        WebElement PasswordField = driver.findElement(By.id("password"));
        PasswordField.sendKeys("Test1234!");
        waitInSeconds(1);

        // enter email in email filed
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
        waitInSeconds(1);

        // enter phone number in Phone Number field
        WebElement phoneNumber = driver.findElement(By.cssSelector("input[type='number']"));
        phoneNumber.sendKeys(phoneNum);
        waitInSeconds(1);

        // enter date of birth in DateOfBirth field
        WebElement dateOfBirth = driver.findElement(By.id("birthDate"));
        dateOfBirth.sendKeys("19/05/2025");
        waitInSeconds(1);

        // enter address in Address field
        WebElement addressField = driver.findElement(By.tagName("textarea"));
        addressField.sendKeys("123 My Street, Himachal Pradesh, India");
        waitInSeconds(1);

        // select country in Country dropdown
        WebElement countryDropdown = driver.findElement(By.id("country"));
        Select select = new Select(countryDropdown);
        select.selectByVisibleText("India");
        waitInSeconds(1);

        // click on 'Female' for Gender field
        WebElement genderField = driver.findElement(By.id("gender-female"));
        genderField.click();
        waitInSeconds(1);

        // click on accepts terms button
        WebElement acceptsTerms = driver.findElement(By.className("accent-blue-500"));
        acceptsTerms.click();
        waitInSeconds(1);

        // click on submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // add validation on registration success page
//        highlightElement(driver.findElement(By.xpath("//td[text()='Full Name']/../td[text()='Jeeva Thakur']")));

        // validate the registration successful user data using assertions
        String actualName = driver.findElement(By.xpath("//td[text()='Full Name']/../td[2]")).getText();
        Assert.assertEquals(actualName, username);

        String actualEmail = driver.findElement(By.xpath("//td[text()='Email']/../td[2]")).getText();
        Assert.assertEquals(actualEmail, email);

        String actualNumber = driver.findElement(By.xpath("//td[text()='Phone']/../td[2]")).getText();
        Assert.assertEquals(actualNumber, phoneNum);


    }
}
