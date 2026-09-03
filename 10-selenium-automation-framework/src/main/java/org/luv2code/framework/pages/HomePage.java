package org.luv2code.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    // locators
    private By authenticationLink = By.linkText("Authentication");

    // constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // actions
    public void clickAuthenticationLink() {
        click(authenticationLink);
    }

}
