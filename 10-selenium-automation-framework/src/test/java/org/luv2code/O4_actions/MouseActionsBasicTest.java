package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MouseActionsBasicTest extends BaseTest {
    @Test
    public void mouseActionsBasicTest() {

        // navigate to ab-testing page
        driver.navigate().to("https://www.luv2test.com/#/ab-testing");

        // basic actions -> moveToElement() -> Toggle theme
        WebElement toggleThemeButton = driver.findElement(By.xpath("//button[@aria-label='Toggle theme']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(toggleThemeButton);
        waitInSeconds(2);

        // basic action -> click()
        actions.click().perform();
        waitInSeconds(2);

        // click on specific element
        actions.click(toggleThemeButton).perform();
        actions.click(driver.findElement(By.id("variant-button-a"))).perform();
        waitInSeconds(2);

        // basic actions -> doubleClick()
        WebElement variantB = driver.findElement(By.id("variant-button-b"));
        actions.doubleClick(variantB).perform();
        waitInSeconds(2);

        // basic actions -> clickAndHold()
        actions.clickAndHold(variantB).perform();

        // Basic actions -> release()
        actions.release(variantB).perform();
        waitInSeconds(2);

        // navigate to context menu page
        driver.navigate().to("https://www.luv2test.com/#/context-menu");

        // move to 'Practice Image Upload' element
        WebElement imageUploadOption = driver.findElement(By.xpath("//li[text()='Practice Image Upload']"));
        actions.moveToElement(imageUploadOption).perform();
        waitInSeconds(2);

        // basic action -> contextClick()
        actions.contextClick(imageUploadOption).perform();
        waitInSeconds(2);

        // click on context-menu-edit button
        actions.click(driver.findElement(By.xpath("//button[@data-test=\"context-menu-edit\"]"))).perform();


    }
}
