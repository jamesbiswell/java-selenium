package org.luv2code.O7_real_time_challanges;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElementHandlingTest extends BaseTest {
    @Test
    public void staleElementHandlingTest() {

        // locate authentication link
        WebElement authenticationLink = driver.findElement(By.xpath("//h3[text()='Authentication']"));
        driver.navigate().refresh();
//        authenticationLink.click();

        int attempts = 0;
        while (attempts < 3) {
            try {
                authenticationLink.click();
                break; // success
            } catch (StaleElementReferenceException exc) {
                System.out.println("StaleElementReferenceException caught. Retrying... " + (attempts + 1));
                authenticationLink = driver.findElement(By.xpath("//h3[text()='Authentication']"));
            }
            attempts++;
        }

        if(attempts == 3) {
            System.out.println("Failed to click after retries due to stale element");
        }

    }
}
