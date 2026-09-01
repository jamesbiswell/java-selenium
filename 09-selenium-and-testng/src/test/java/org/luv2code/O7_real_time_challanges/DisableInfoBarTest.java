package org.luv2code.O7_real_time_challanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DisableInfoBarTest {
    @Test
    public void disabledInfoBarTest() {

        // Set chrome options
        ChromeOptions options = new ChromeOptions();

        // disable the "Chrome is being controlled by automated test software" info-bar
        options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});

        // Initialize webdriver with these options
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://luv2test.com/#/");

    }
}
