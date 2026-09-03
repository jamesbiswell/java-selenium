package org.luv2code.O10_framework_tests;

import org.luv2code.framework.base.BaseTest;
import org.luv2code.framework.constants.TestDataConstant;
import org.luv2code.framework.listeners.MyListener;
import org.luv2code.framework.pages.AuthenticationPage;
import org.luv2code.framework.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class AuthenticationTest extends BaseTest {
    @Test
    public void authenticationTest() {

        // initialize pages
        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);

        homePage.getTitle();

        // Click on "Authentication" link
        homePage.clickAuthenticationLink();

        authenticationPage.getTitle();

        // Check presence of "Authentication" heading
        authenticationPage.checkPresenceOfAuthenticationHeading();

        // Check presence of "Welcome!" heading
        authenticationPage.checkPresenceOfWelcomeHeading();

        // login
        authenticationPage.login(TestDataConstant.ADMIN_USERNAME, TestDataConstant.ADMIN_PASSWORD);

        // Check presence of "Login Successful" heading
        authenticationPage.checkPresenceOfLoginSuccessMessage();
        waitInSeconds(2);

        // click on "Logout" button
        authenticationPage.clickOnLogoutButton();
        waitInSeconds(2);

        // Check presence of "Welcome!" heading
        authenticationPage.checkPresenceOfWelcomeHeading();
        Assert.assertEquals(authenticationPage.getHeadingText(), "Authentication");
        waitInSeconds(2);

    }
}
