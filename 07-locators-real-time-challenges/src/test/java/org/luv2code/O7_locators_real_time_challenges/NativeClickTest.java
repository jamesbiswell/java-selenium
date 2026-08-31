package org.luv2code.O7_locators_real_time_challenges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NativeClickTest extends BaseTest {
    @Test
    public void nativeClickTest() {

        // Navigate to "Dynamic Elements" page
        driver.navigate().to("https://luv2test.com/#/dynamic-elements");
        
        WebElement dynamicIdButton = driver.findElement(By.xpath("//button[contains(@id,'btn_')]"));
        highlightElement(dynamicIdButton);
        // dynamicIdButton.click();
        nativeClick(dynamicIdButton);

        WebElement dynamicContent = driver.findElement(By.xpath("//div[contains(text(),'Dynamic button clicked successfully!')]"));
        System.out.println("Dynamic button clicked: " + dynamicContent.isDisplayed());

    }

    public void nativeClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

}
