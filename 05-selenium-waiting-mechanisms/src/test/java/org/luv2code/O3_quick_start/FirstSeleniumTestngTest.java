package org.luv2code.O3_quick_start;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTestngTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // open a browser using selenium
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to Luv2Test site
        driver.get("https://www.luv2test.com");
        System.out.println("Page Title: " + driver.getTitle());
    }

    @Test
    public void firstSeleniumTestngTest() {
        // click on Authentication link
        driver.findElement(By.linkText("Authentication")).click();

        // verify login heading
        boolean isHeadingPresent = driver.findElement(By.xpath("//h2[text()='Login']")).isDisplayed();
        System.out.println("Is Login form heading present: " + isHeadingPresent);
    }

    @AfterMethod
    public void tearDown() {
        // close the browser
        driver.quit();
    }

}
