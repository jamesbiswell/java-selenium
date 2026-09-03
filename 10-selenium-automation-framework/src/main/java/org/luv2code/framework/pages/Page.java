package org.luv2code.framework.pages;

import org.luv2code.framework.utils.ConfigUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    // common actions

    // check presence of element
    public void shouldBeDisplayed(By locator) {
        long startTime = System.currentTimeMillis();
        System.out.println("Finding element: " + locator.toString());
        
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        System.out.println("Element found: " + locator.toString() + " in " + duration + " ms");
        
        if (ConfigUtil.getProperty("debug").equals("true")) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // apply a red border around the element
            js.executeScript("arguments[0].style.border='3px solid red';", element);
        }
    }

    // click locator
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    // click element
    public void click(WebElement element) {
        element.click();
    }
    
    // type text
    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // get text
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    // get title
    public String getTitle() {
        return driver.getTitle();
    }

}
