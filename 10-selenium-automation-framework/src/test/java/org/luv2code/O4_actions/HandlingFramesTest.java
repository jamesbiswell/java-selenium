package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFramesTest extends BaseTest {
    @Test
    public void handlingFramesTest() {

        // navigate to iFrames page
        driver.navigate().to("https://www.luv2test.com/#/iframes");

        // find input-name element and send keys
        // Note: this will fail as this text field comes under iFrame
//        driver.findElement(By.id("input-name")).sendKeys("Jeeva");

        // switch to iframe 1
        driver.switchTo().frame("iframe1");

        // locate the text fields
        WebElement name = driver.findElement(By.id("input-name"));
        WebElement password = driver.findElement(By.id("input-password"));

        // enter data into name and password field
        name.sendKeys("Jeeva Thakur");
        password.sendKeys("Password@123");

        // switch to default content
        driver.switchTo().defaultContent();

        // switch to iframe 2
        driver.switchTo().frame("iframe2");

        // locate inner frame
        WebElement innerIFrame = driver.findElement(By.xpath("//h2[text()='Outer Iframe']/../iframe"));
        // switch to inner frame
        driver.switchTo().frame(innerIFrame);
        driver.findElement(By.id("inner-input-name")).sendKeys("Nitesh Bhardwaj");
        driver.findElement(By.id("inner-input-password")).sendKeys("Password@321");

        // switch to parent frame
        driver.switchTo().parentFrame();
        // get out frame p text
        String outerFrameDescription = driver.findElement(By.xpath("//p[text()='This iframe contains a nested inner iframe.']")).getText();
        System.out.println("Outer iframe description: " + outerFrameDescription);

        // switch to default content
        driver.switchTo().defaultContent();

        // switch to default content
        String pageDescription = driver.findElement(By.xpath("//p[contains(text(),'Practice working with iframes')]")).getText();
        System.out.println("Page description: " + pageDescription);

    }
}
