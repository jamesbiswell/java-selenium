package org.luv2code.O8_selenium4_features;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.network.Network;
import org.testng.annotations.Test;

import java.util.Optional;

public class DevToolsTest {
    @Test
    public void devToolsTest() {

        // setup our chrome driver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // start devtools session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // monitor network requests
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(), request ->
                System.out.println("Request URL: " + request.getRequest().getUrl()));

        System.out.println("Home Page");
        driver.get("https://luv2test.com/#/");
        System.out.println();
        System.out.println("Broken images page");
        driver.navigate().to("https://luv2test.com/#/broken-images");

        // listen to console logs
        // geolocation overridden to "New Your city"

    }
}
