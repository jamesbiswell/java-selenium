package org.luv2code.O5_wait_mechanisms;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitTest extends BaseTest {
    @Test
    public void fluentWaitTest() {

        // navigate to dynamic elements page
        driver.navigate().to("https://luv2test.com/#/dynamic-elements");

        // Fluent Wait configuration
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // wait for the first dynamic tip element to be visible
        WebElement dynamicTip = fluentWait.until(driver -> {
            WebElement dynamicContent = driver.findElement(By.xpath("//li[text()='Tip: Use keyboard shortcuts to improve productivity']"));
            return dynamicContent.isDisplayed() ? dynamicContent : null;
        });
        highlightElement(dynamicTip);

        // set the slider value using actions class
        WebElement slider = driver.findElement(By.cssSelector("input[data-test='load-time-slider']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(slider, 0, 0).clickAndHold().moveByOffset(50, 0).release().perform();

        // wait for the second dynamic element
        WebElement didYouKnowElement = fluentWait.until(driver -> {
            WebElement element = driver.findElement(By.xpath("//li[text()='Did you know? You can undo closed tabs with Ctrl+Shift+T']"));
            return element.isDisplayed() ? element : null;
        });
        highlightElement(didYouKnowElement);

    }
}
