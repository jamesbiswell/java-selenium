package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MoreOnHandlingTabsTest extends BaseTest {
    @Test
    public void moreOnHandlingTabsTest() {

        // navigate to tabs-windows page
        driver.navigate().to("https://www.luv2test.com/#/tabs-windows");

        // store the id of the original window
        String originalWindow = driver.getWindowHandle();

        // open three new tabs
        for(int i = 0; i < 3; i++) {
            // click on 'Open Home Page (New Tab)' button
            driver.findElement(By.xpath("//button[@data-test='open-home-tab']")).click();

            // switch to original window
            driver.switchTo().window(originalWindow);
        }

        // switch to all windows one by one
        Set<String> allTabsHandles = driver.getWindowHandles();
        for (String tabHandle: allTabsHandles) {
            driver.switchTo().window(tabHandle);
            waitInSeconds(1);
        }

        // Open blank window
        driver.switchTo().newWindow(WindowType.TAB);
        waitInSeconds(1);

        // switch back to original tab
        driver.switchTo().window(originalWindow);
        waitInSeconds(1);

        // convert to lest and access by index
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());

        // switch to third open tab
        driver.switchTo().window(tabList.get(2));
        waitInSeconds(1);

        // close all except main tab
        for (String tab: driver.getWindowHandles()) {
            if(!tab.equals(originalWindow)){
                driver.switchTo().window(tab);
                driver.close();
            }
        }

        driver.switchTo().window(originalWindow);
        waitInSeconds(2);

        // click on 'Uncheck All' button
        driver.findElement(By.xpath("//button[text()='Uncheck All']")).click();


    }
}
