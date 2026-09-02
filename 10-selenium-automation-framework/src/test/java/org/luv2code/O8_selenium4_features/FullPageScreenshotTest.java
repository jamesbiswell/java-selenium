package org.luv2code.O8_selenium4_features;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FullPageScreenshotTest {
    @Test
    public void fullPageScreenshotTest() throws InterruptedException, IOException {

        // setup firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // initialize firefox driver
        FirefoxDriver driver = new FirefoxDriver();

        // maximize the window
        driver.manage().window().maximize();

        driver.get("https://luv2test.com/");

        // verify home page heading
        driver.findElement(By.xpath("//h1['Luv2Code Automation Practice (Web and Mobile Web)']"));
        System.out.println("page title: " + driver.getTitle());

        // Take full page screenshot
        File screenshot = driver.getFullPageScreenshotAs(OutputType.FILE);
        File dest = new File("target/screenshots/full_page_screenshot.png");
        FileUtils.copyFile(screenshot, dest);
        System.out.println("full page screenshot saved: " + dest.getAbsolutePath());

        Thread.sleep(5000);

        // quit firefox browser
        driver.quit();

    }
}
