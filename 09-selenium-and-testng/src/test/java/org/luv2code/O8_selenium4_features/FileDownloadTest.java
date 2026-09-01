package org.luv2code.O8_selenium4_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDownloadTest {
    @Test
    public void fileDownloadTest() throws InterruptedException {

        // set custom download directory
        String downloadFilePath = System.getProperty("user.dir") + "/target/downloads";
        System.out.println(downloadFilePath);

        // set preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadFilePath);
        prefs.put("download.prompt_for_download", false);

        // set experimental option
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // initialize the driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // open file download page
        driver.get("https://luv2test.com/#/file-download");

        // click sample csv file download button
        WebElement sampleCsvFile = driver.findElement(By.xpath("//h3[text()='Sample CSV']/../../../button"));
        sampleCsvFile.click();

        // verify file is downloaded
        String expectedFileName = "sample.csv";
        File file = new File(downloadFilePath, expectedFileName);

        for (int i = 0; i < 5; i++) {
            if(file.exists() && file.length() > 0) {
                System.out.println("file is downloaded: " + file.getName());
                break;
            }
            Thread.sleep(1000);
        }
    }
}
