package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingShadowDomTest extends BaseTest {
    @Test
    public void handlingShadowDomTest() {

        // navigate to shadow dom page
        driver.navigate().to("https://www.luv2test.com/#/shadow-dom");

        // find the shadow host
        WebElement shadowHost = driver.findElement(By.xpath("//div[@data-test='shadow-host']"));

        // access shadow root using Selenium 4 native support
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        // click on "Click Me!" button
        WebElement clickMeButton = shadowRoot.findElement(By.cssSelector("button[class='shadow-button']"));
        highlightElement(clickMeButton);
        clickMeButton.click();
        System.out.println(clickMeButton.getText() + " :: Clicked Successfully!");

        // Get nested shadow host from outer shadow root
        WebElement nestedShadowHostElement = shadowRoot.findElement(By.cssSelector("#nested-shadow-host"));
        SearchContext nestedShadowRoot = nestedShadowHostElement.getShadowRoot();

        highlightElement(nestedShadowRoot.findElement(By.cssSelector(".nested-content > h3")));

        // Get and switch to iframe inside the nested shadow root
        WebElement iframe = nestedShadowRoot.findElement(By.cssSelector("#nested-iframe"));
        driver.switchTo().frame(iframe);
        highlightElement(driver.findElement(By.cssSelector("#iframe-shadow-host")));

        // Get nested shadow host from outer shadow root
        WebElement iframeShadowHost = driver.findElement((By.cssSelector("#iframe-shadow-host")));
        SearchContext iFrameShadowRoot = iframeShadowHost.getShadowRoot();

        // Find the dark mode button and check presence
        System.out.println("Is dark mode button present: " + iFrameShadowRoot.findElement(By.cssSelector("#dark-mode-toggle")).isDisplayed());

        // move to regular dom content
        driver.switchTo().defaultContent();

        highlightElement(driver.findElement(By.xpath("//h3[text()='Regular DOM Content']")));

    }
}
