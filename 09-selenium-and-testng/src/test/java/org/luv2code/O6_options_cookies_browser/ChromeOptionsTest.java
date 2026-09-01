package org.luv2code.O6_options_cookies_browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsTest {
    @Test
    public void chromeOptionsTest () {

        // user WebDriverManger to automatically manger chrome driver
        WebDriverManager.chromedriver().setup();

        // chrome options
        ChromeOptions options = new ChromeOptions();

        // 1. open browser in maximized mode
        options.addArguments("--start-maximized");

//        // 2. open browser in different size
//        options.addArguments("--window-size=1024,1366");
//
//        // 3. open in incognito mode
//        options.addArguments("--incognito");
//
//        // 4. enable headless mode (headless mode runs chrome in the background - no GUI - useful for CI/CD pipelines)
//        options.addArguments("--headless=new");

        // 5. disable extensions, notifications, popups - example web outlooks mails
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        // 6. accept SSL certificates
        options.setAcceptInsecureCerts(true);

        // initialize webdriver
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
//        driver.get("https://luv2test.com/");

    }
}
