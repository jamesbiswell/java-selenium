package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingTabsTest extends BaseTest {
    @Test
    public void handlingTabsTest() {

        // navigate to tabs-windows page
        driver.navigate().to("https://www.luv2test.com/#/tabs-windows");

        // store the id of the original tab
        String originalTab = driver.getWindowHandle();
        System.out.println("Original Tab ID: " + originalTab);

        // click on "Open Home Page (New Tab)" button
        WebElement newTabButton = driver.findElement(By.xpath("//button[@data-test='open-home-tab']"));
        waitInSeconds(2);
        newTabButton.click();

        // Get all window handles
        Set<String> allTabs = driver.getWindowHandles();

        // basic: switch to new window - loop through them to find the new window
        for(String newTab : allTabs) {
            if(!newTab.equals(originalTab)) {
                driver.switchTo().window(newTab);
                break;
            }
        }

        // now you're in the new window - perform operation here
        System.out.println("Title of new window: " + driver.getTitle());

        // verify home page heading in new tab
        highlightElement(driver.findElement(By.xpath("//h1[text()='Luv2Code Automation Practice (Web and Mobile Web)']")));
        waitInSeconds(2);

        // switch back to original tab
        driver.switchTo().window(originalTab);
        waitInSeconds(2);

        // click on check all button
        driver.findElement(By.xpath("//button[text()='Check All']")).click();

    }
}
