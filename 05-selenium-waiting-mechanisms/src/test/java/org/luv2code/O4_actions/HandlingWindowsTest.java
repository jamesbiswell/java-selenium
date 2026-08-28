package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingWindowsTest extends BaseTest {
    @Test
    public void handlingWindowsTest() {

        // navigate to tabs-windows page
        driver.navigate().to("https://www.luv2test.com/#/tabs-windows");

        // store the id of the original window
        String originalWindow = driver.getWindowHandle();

        // click on 'Open Home Page (New Window)' button
        WebElement newWindowButton = driver.findElement(By.xpath("//button[@data-test='open-home-window']"));
        newWindowButton.click();

        // get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // basic - switch to new window - loop through them to find the new window
        for(String windowHandle: allWindows) {
            if(!windowHandle.equals(originalWindow)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // now you're in the new window - perform your actions here
        System.out.println("Title of new window: " + driver.getTitle());
        waitInSeconds(2);

        // verify heading in new window
        highlightElement(driver.findElement(By.xpath("//h1[text()='Luv2Code Automation Practice (Web and Mobile Web)']")));
        waitInSeconds(2);

        // switch back to original window
        driver.switchTo().window(originalWindow);
        waitInSeconds(1);

        // click on check all button
        driver.findElement(By.xpath("//button[text()='Check All']")).click();

    }
}
