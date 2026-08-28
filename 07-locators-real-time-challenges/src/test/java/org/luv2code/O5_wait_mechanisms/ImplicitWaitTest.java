package org.luv2code.O5_wait_mechanisms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWaitTest {
    @Test
    public void implicitWaitTest() {

        // use WebDriverManager to automatically manage chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open dynamic element page
        driver.get("https://luv2test.com/#/dynamic-elements");

        // set implicit wait (this applies to all findElements calls)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // locate and check presence of dynamic content 'Tip'
        WebElement dynamicContent = driver.findElement(By.xpath("//li[text()='Tip: Use keyboard shortcuts to improve productivity']"));
        System.out.println(dynamicContent.isDisplayed());
        System.out.println(dynamicContent.getText());

    }
}
