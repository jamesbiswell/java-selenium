package org.luv2code.O5_wait_mechanisms;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitTest extends BaseTest {
    @Test
    public void explicitWaitTest() {

        // navigate to dynamic elements page
        driver.navigate().to("https://luv2test.com/#/dynamic-elements");

        // locate the dynamic tip and highlight the same
        WebElement dynamicContent = driver.findElement(By.xpath("//li[text()='Tip: Use keyboard shortcuts to improve productivity']"));
        highlightElement(dynamicContent);

        waitInSeconds(1);

        WebElement slider = driver.findElement(By.cssSelector("input[data-test='load-time-slider']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(slider, 0, 0).clickAndHold().moveByOffset(50, 0).release().perform();

        // introduce webdriver wait or explicit wait to handle this
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By didYouKnowLocator = By.xpath("//li[text()='Did you know? You can undo closed tabs with Ctrl+Shift+T']");
        WebElement didYouKnowElement = wait.until(ExpectedConditions.visibilityOfElementLocated(didYouKnowLocator));
        highlightElement(didYouKnowElement);

    }
}
