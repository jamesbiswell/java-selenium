package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActionsTest extends BaseTest {
    @Test
    public void keyboardActionsTest() {

        // navigate to key-presses page
        driver.navigate().to("https://www.luv2test.com/#/key-press");

        Actions actions = new Actions(driver);
        actions.sendKeys("A").perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ESCAPE).perform();
        actions.sendKeys(Keys.BACK_SPACE).perform();

        // navigate to authentication page
        driver.navigate().to("https://www.luv2test.com/#/auth");

        // locate our username and password filed
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // type 'admin' in username field
        actions.sendKeys(username, "admin").perform();
        waitInSeconds(1);

        // select all text in username filed
        actions.click(username).keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();

        // copy selected text
        actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();

        // click on password field
        actions.click(password).perform();

        // paste password into password field
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
        waitInSeconds(2);

        password.submit();

    }
}
