package org.luv2code.O6_options_cookies_browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdgeTest {
    @Test
    public void launchEdgeTest() throws InterruptedException {

        // setup edge driver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // initialize edge driver
        WebDriver driver = new EdgeDriver();

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
