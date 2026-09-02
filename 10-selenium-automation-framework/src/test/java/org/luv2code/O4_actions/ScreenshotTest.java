package org.luv2code.O4_actions;

import org.apache.commons.io.FileUtils;
import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest extends BaseTest {
    @Test
    public void takeScreenshotTest() throws IOException {

        // take screenshot of a home page
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // save the screenshot
        File destFile = new File("target/screenshots/homepage.png");
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("Screenshot saved to: " + destFile.getAbsolutePath());

        // take screenshot of web element or section
        WebElement mainHeading = driver.findElement(By.xpath("//h1[text()='Luv2Code Automation Practice (Web and Mobile Web)']"));
        File mainHeadingScreen = mainHeading.getScreenshotAs(OutputType.FILE);
        File destinationLocation = new File("target/screenshots/mainHeading.png");
        FileUtils.copyFile(mainHeadingScreen, destinationLocation);
        System.out.println("Heading screenshot saved to: " + destinationLocation.getAbsolutePath());

    }
}
