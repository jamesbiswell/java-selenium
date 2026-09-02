package org.luv2code.O3_quick_start;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HighlightElementTest extends BaseTest {

    @Test
    public void highlightElementTest() {

        highlightElement(driver.findElement(By.xpath("//h1[text()='Luv2Code Automation Practice (Web and Mobile Web)']")));
        highlightElement(driver.findElement(By.xpath("//h3[text()='Authentication']")));

    }

}
