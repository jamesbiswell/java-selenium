package org.luv2code.O8_selenium4_features;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocatorsTest extends BaseTest {
    @Test
    public void relativeLocatorsTest() {

        // navigate to login-form page
        driver.navigate().to("https://luv2test.com/#/login-form");

        // reference element (central anchor element)
        WebElement anchor = driver.findElement(By.xpath("//strong[text()='TestUser@example.com']"));

        // 1. Above
        WebElement above = driver.findElement(RelativeLocator.with(By.tagName("strong")).above(anchor));
        highlightElement(above);

        // 2. Below
        WebElement below = driver.findElement(RelativeLocator.with(By.tagName("form")).below(anchor));
        highlightElement(below);

        // 3. Left
        WebElement left = driver.findElement(RelativeLocator.with(By.tagName("strong")).toLeftOf(anchor));
        highlightElement(left);

        // 4. Right
        WebElement right = driver.findElement(RelativeLocator.with(By.tagName("strong")).toRightOf(anchor));
        highlightElement(right);

        // 5. Near (within ~ 50 pixels)
        WebElement near = driver.findElement(RelativeLocator.with(By.tagName("div")).near(anchor));
        highlightElement(near);

    }
}
