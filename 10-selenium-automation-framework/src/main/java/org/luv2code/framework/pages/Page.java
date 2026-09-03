package org.luv2code.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {

    protected WebDriver driver;

    public Page (WebDriver driver) {
        this.driver = driver;
    }

    // common actions

    // check presence of element
    public void shouldBeDisplayed(By locator) {
        WebElement element = driver.findElement(locator);
        element.isDisplayed();
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
