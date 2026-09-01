package org.luv2code.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {
    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        {
            Logger seleniumLogger = Logger.getLogger("org.openqa.selenium");
            seleniumLogger.setLevel(Level.OFF);
        }
        // open a browser using selenium
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // navigate to Luv2Test site
        driver.get("https://www.luv2test.com");
        System.out.println("\nPage Title: " + driver.getTitle());
    }

    // wait in seconds method
    public void waitInSeconds(long seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // method to highlight element
    public static void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // apply a red border around the element
        js.executeScript("arguments[0].style.border='3px solid red';", element);
//        js.executeScript("arguments[0].style.border='3px solid red'; " +
//                "arguments[0].style.backgroundColor='yellow'", element);
    }

    @AfterMethod
    public void tearDown() {
        // close the browser
        driver.quit();
    }
}
