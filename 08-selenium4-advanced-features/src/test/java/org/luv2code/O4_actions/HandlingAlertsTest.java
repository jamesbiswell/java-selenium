package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingAlertsTest extends BaseTest {
    @Test
    public void handlingAlertsTest() {

        // navigate to Alerts page
        driver.navigate().to("https://www.luv2test.com/#/alerts");

        // check presence of "JavaScript Alerts" heading
        highlightElement(driver.findElement(By.xpath("//h1[text()='JavaScript Alerts']")));

        // 1. handle simple alert
        WebElement showAlert = driver.findElement(By.xpath("//button[@data-test='alert-button']"));
        showAlert.click();
        waitInSeconds(2);

        // switch to open alert
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        // click on Ok button
        simpleAlert.accept();
        waitInSeconds(2);

        // 2. handle confirmation alert
        driver.findElement(By.xpath("//button[@data-test='confirm-button']")).click();
        // switch to open alert
        Alert confirmAlert = driver.switchTo().alert();
        // print text from alert
        System.out.println("Confirmation Alert Text: " + confirmAlert.getText());
        waitInSeconds(2);
        // click on cancel (use .accept() for Ok)
        confirmAlert.dismiss();
        waitInSeconds(2);

        // 3. handle prompt alert
        driver.findElement(By.xpath("//button[@data-test='prompt-button']")).click();
        // switch to open alert
        Alert promptAlert = driver.switchTo().alert();
        // print text from alert
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        waitInSeconds(2);
        // send text to prompt alert
        promptAlert.sendKeys("Hello from Selenium!");
        waitInSeconds(2);
        // click Ok
        promptAlert.accept();

    }
}
