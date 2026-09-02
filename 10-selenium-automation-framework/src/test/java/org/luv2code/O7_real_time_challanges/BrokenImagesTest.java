package org.luv2code.O7_real_time_challanges;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesTest extends BaseTest {
    @Test
    public void brokenImagesTest() {

        // navigate to broken images page
        driver.navigate().to("https://luv2test.com/#/broken-images");

        // get all the images or img tag
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("\nTotal image found: " + images.size());

        // verify broken images
        for (WebElement img : images) {
            String imgUrl = img.getAttribute("src");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imgUrl).openConnection();
                connection.setRequestMethod("GET"); // HEAD
                connection.connect();
                connection.setConnectTimeout(2000);
                int code = connection.getResponseCode();
                if(code >= 400) {
                    System.err.println("Broken Image: " + imgUrl + " - Status: " + code);
                } else {
                    System.out.println("Valid Image: " + imgUrl + " - Status: " + code);
                }

            } catch (Exception exc) {
                System.err.println("Error checking image: " + imgUrl);
            }
        }

    }
}
