package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RetrievingElementInfoAndStatesTest extends BaseTest {
    @Test
    public void retrievingElementInfoAndStatesTest() {

        // Retrieving element Information
        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println("Text: " + heading.getText());
        System.out.println("Tag Name: " + heading.getTagName());
        System.out.println("Attribute (class): " + heading.getAttribute("class"));
        System.out.println("CSS Value (color): " + heading.getCssValue("color"));
        System.out.println("Location: " + heading.getLocation());
        System.out.println("Size: " + heading.getSize());

        // Navigate to "Tab Window & Checkboxes"
        driver.navigate().to("https://www.luv2test.com/#/tabs-windows");

        // Checking Element States
        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
        System.out.println("Displayed: " + checkbox1.isDisplayed());
        System.out.println("Enabled: " + checkbox1.isEnabled());
        System.out.println("Selected: " + checkbox1.isSelected());

        System.out.println();

        WebElement checkbox4 = driver.findElement(By.id("checkbox4"));
        System.out.println("Displayed: " + checkbox4.isDisplayed());
        System.out.println("Enabled: " + checkbox4.isEnabled());
        System.out.println("Selected: " + checkbox4.isSelected());

    }
}
