package org.luv2code.O6_options_cookies_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

// NOTE:
// LaunchSafariTest will work only in macOS
// You must enable "Allow Remote Automation" in Safari -> Settings -> Advanced -> Developer Tools
// SafariDrive is build-in (no WebDriverManager setup is needed)

public class LaunchSafariTest {
    @Test
    public void launchSafariTest () throws InterruptedException {

        // initialize SafariDriver (no WebDriver manager needed)
        WebDriver driver = new SafariDriver();

        // maximize window
        driver.manage().window().maximize();

        // maximize the edge browser
        driver.manage().window().maximize();

        // launch the luv2test site
        driver.get("https://luv2test.com/");

        // verify home page heading
        driver.findElement(By.xpath("//h1['Luv2Code Automation Practice (Web and Mobile Web)']"));
        System.out.println("page title: " + driver.getTitle());

        Thread.sleep(5000);

        // quit firefox browser
        driver.quit();

    }
}
