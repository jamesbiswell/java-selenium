package org.luv2code.O8_selenium4_features;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class EnhancedWindowManagementTest extends BaseTest {
    @Test
    public void enhancedWindowManagementTest() {

        // open google.com in new tab
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://www.google.com/");
        waitInSeconds(2);

        // open luv2test.com new window
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
        newWindow.get("https://luv2test.com/");
        waitInSeconds(2);

        // minimize the window
        driver.manage().window().minimize();
        waitInSeconds(2);

        // fullscreen mode
        driver.manage().window().fullscreen();
        waitInSeconds(2);

        // get current window position
        Point position = driver.manage().window().getPosition();
        System.out.println("Current Window Position: " + position);

        // set custom window size
        driver.manage().window().setSize(new Dimension(800, 600));
        waitInSeconds(2);

        // move window to new position
        driver.manage().window().setPosition(new Point(200, 100));
        waitInSeconds(2);

    }
}
