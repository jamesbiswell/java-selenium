package org.luv2code.O7_locators_real_time_challenges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollToElementTest extends BaseTest {
    @Test
    public void scrollToElementTest() {

        // Locate 'About' link
        WebElement aboutLink = driver.findElement(By.xpath("//h3[text()='About']"));
        waitInSeconds(2);

        // Scroll to element
        // Even with Selenium 4, this remains a reliable way
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", aboutLink);
        highlightElement(aboutLink);

        waitInSeconds(2);
        aboutLink.click();
        waitInSeconds(2);

        // Verify 'About' page heading
        WebElement aboutHeading = driver.findElement(By.xpath("//h1[text()='Luv2Code Team and Automation Practice Site']"));
        waitInSeconds(2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", aboutHeading);
        waitInSeconds(2);
        highlightElement(aboutHeading);

    }
    
}
