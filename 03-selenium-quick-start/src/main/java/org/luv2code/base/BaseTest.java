package org.luv2code.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // open a browser using selenium
        WebDriverManager.chromedriver().setup();

//        // set path to chrome driver binary
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to Luv2Test site
        driver.get("https://www.luv2test.com");
        System.out.println("\nPage Title: " + driver.getTitle());
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
//        driver.quit();
    }
}
