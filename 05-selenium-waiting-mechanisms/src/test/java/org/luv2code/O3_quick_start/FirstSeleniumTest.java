package org.luv2code.O3_quick_start;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String [] args) {

        // open a browser using selenium
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to Luv2Test site
        driver.get("https://www.luv2test.com");
        System.out.println("Page Title: " + driver.getTitle());

        // click on Authentication link
        driver.findElement(By.linkText("Authentication")).click();

        // verify login heading
        boolean isHeadingPresent = driver.findElement(By.xpath("//h2[text()='Login']")).isDisplayed();
        System.out.println("Is Login form heading present: " + isHeadingPresent);

        // close the browser
        driver.quit();

    }
}
