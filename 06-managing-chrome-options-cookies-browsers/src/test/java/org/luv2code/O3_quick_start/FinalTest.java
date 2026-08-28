package org.luv2code.O3_quick_start;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FinalTest extends BaseTest {

    @Test
    public void runFinalTest() {
        // click on Authentication link
        driver.findElement(By.linkText("Authentication")).click();

        // verify login heading
        boolean isHeadingPresent = driver.findElement(By.xpath("//h2[text()='Login']")).isDisplayed();
        System.out.println("Is Login form heading present: " + isHeadingPresent);
    }

}
