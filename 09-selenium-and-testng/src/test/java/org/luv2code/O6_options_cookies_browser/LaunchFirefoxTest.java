package org.luv2code.O6_options_cookies_browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefoxTest {
    @Test
    public void launchFirefoxTest() throws InterruptedException {

        // setup firefox driver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // initialize firefox driver
        WebDriver driver = new FirefoxDriver();

        // maximize the window
        driver.manage().window().maximize();

        driver.get("https://luv2test.com/");

        // verify home page heading
        driver.findElement(By.xpath("//h1['Luv2Code Automation Practice (Web and Mobile Web)']"));

        System.out.println("page title: " + driver.getTitle());

        Thread.sleep(5000);

        // quit firefox browser
        driver.quit();

    }
}
