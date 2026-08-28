package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragAndDropTest extends BaseTest {
    @Test
    public void dragAndDropTest() {

        // navigate to drag and drop page
        driver.navigate().to("https://www.luv2test.com/#/drag-drop");

        // locate source and target element
        WebElement pineapple = driver.findElement(By.id("sortable-item-Pineapple"));
        WebElement droppedArea = driver.findElement(By.id("dropped-area"));

        // advance actions -> dragAndDrop() & pause()
        Actions actions = new Actions(driver);
        actions.pause(Duration.ofSeconds(1)).dragAndDrop(pineapple, droppedArea).perform();

        WebElement apple = driver.findElement(By.id("sortable-item-Apple"));
        actions.pause(Duration.ofSeconds(1)).dragAndDrop(apple, droppedArea).perform();

        WebElement grapes = driver.findElement(By.id("sortable-item-Grapes"));
        actions.pause(Duration.ofSeconds(1)).dragAndDrop(grapes, droppedArea).perform();

        // advances actions -> clickAndHold() -> moveByOffset() -> release() -> build()
        WebElement banana = driver.findElement(By.id("sortable-item-Banana"));
        actions.clickAndHold(banana)
                .pause(Duration.ofSeconds(1))
                .moveByOffset(200, 300)
                .release()
                .build()
                .perform();

    }
}
