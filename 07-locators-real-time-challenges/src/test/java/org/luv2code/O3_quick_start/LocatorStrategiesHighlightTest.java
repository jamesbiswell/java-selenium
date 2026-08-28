package org.luv2code.O3_quick_start;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorStrategiesHighlightTest extends BaseTest {

    @Test
    public void locatorStrategiesHighlightTest() {

        driver.navigate().to("https://www.luv2test.com/#/registration-form");

        // 1. Locate by link text (only for <a> tags)
        highlightElement(driver.findElement(By.linkText("Authentication")));

        // 2. locate by partial link text (only for <a> tags)
        highlightElement(driver.findElement(By.partialLinkText("Registration")));

        // 3. Locate by ID
        highlightElement(driver.findElement(By.id("fullName")));

        // 4. Locate by Name
        highlightElement(driver.findElement(By.name("password")));

        // 5. Locate by Tag Name
        highlightElement(driver.findElement(By.tagName("textarea")));

        // 6. Locate by Class name
        highlightElement(driver.findElement(By.className("accent-blue-500")));

        // 7. Locate by CSS Selector
        highlightElement(driver.findElement(By.cssSelector("input[type='number']")));

        // 8. Locate by XPath
        highlightElement(driver.findElement(By.xpath("//input[@id='gender-female']")));

    }

}
