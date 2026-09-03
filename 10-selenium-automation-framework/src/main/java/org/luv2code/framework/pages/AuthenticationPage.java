package org.luv2code.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Page {

    // locators
    private By authenticationHeading = By.xpath("//h1[text()='Authentication']");
    private By welcomeHeading = By.xpath("//h1[text()='Welcome!']");
    private By usernameFiled = By.id("username");
    private By passwordFiled = By.id("password");
    private By signInButton = By.cssSelector("button[type='submit']");
    private By loginSuccessHeading = By.xpath("//h2[contains(text(), 'Login Successful')]");
    private By logoutButton = By.xpath("//button[text()='Logout']");

    // constructor
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    // actions

    /**
     * method to check presence of authentication heading
     */
    public void checkPresenceOfAuthenticationHeading() {
        shouldBeDisplayed(authenticationHeading);
    }

    /**
     * method to check presence of welcome heading
     */
    public void checkPresenceOfWelcomeHeading() {
        shouldBeDisplayed(welcomeHeading);
    }

    /**
     * method to perform login
     * @param username needs to be set
     * @param password needs to be set
     */
    public void login(String username, String password) {
        type(usernameFiled, username);
        type(passwordFiled, password);
        click(signInButton);
    }

    public void checkPresenceOfLoginSuccessMessage() {
        shouldBeDisplayed(loginSuccessHeading);
    }

    public void clickOnLogoutButton() {
        click(logoutButton);
    }

    public String getHeadingText() {
        return getText(authenticationHeading);
    }
}
