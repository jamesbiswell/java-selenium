package org.luv2code.O7_locators_real_time_challenges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicLocatorTest extends BaseTest {
    @Test
    public void dynamicLocatorTest() {

        // Navigate to "Dynamic Elements" page
        driver.navigate().to("https://luv2test.com/#/dynamic-elements");

        // dynamic id button
        // WebElement dynamicIdButton = driver.findElement(By.id("btn_k5zmk20n")); // btn_vi8n9s2w
        // highlightElement(dynamicIdButton);

        // WebElement dynamicIdButton = driver.findElement(By.xpath("//button[contains(@id,'btn_')]"));
        // highlightElement(dynamicIdButton);
        // dynamicIdButton.click();

        // WebElement dynamicContent = driver.findElement(By.xpath("//div[contains(text(),'Dynamic button clicked successfully!')]"));
        // System.out.println("Dynamic button clicked: " + dynamicContent.isDisplayed());

    }
}
