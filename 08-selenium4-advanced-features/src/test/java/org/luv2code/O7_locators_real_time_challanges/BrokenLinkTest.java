package org.luv2code.O7_real_time_challanges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkTest extends BaseTest {
    @Test
    public void brokenLinkTest() {

        // get all the link or <a> tag
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("\nTotal links found: " + links.size());

        // verify broken links
        for (WebElement link : links) {
            highlightElement(link);
            String linkUrl = link.getAttribute("href");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
                connection.setRequestMethod("HEAD"); // GET
                connection.connect();
                connection.setConnectTimeout(2000);
                int code = connection.getResponseCode();
                if(code >= 400) {
                    System.err.println("Broken Link: " + linkUrl + " - Status: " + code);
                } else {
                    System.out.println("Valid Link: " + linkUrl + " - Status: " + code);
                }

            } catch (Exception exc) {
                System.err.println("Error checking links: " + linkUrl);
            }
        }

    }

}
