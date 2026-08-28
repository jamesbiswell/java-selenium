package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFilesUploadsTest extends BaseTest {
    @Test
    public void handlingFilesUploadsTest() {

        // navigate to File Upload page
        driver.navigate().to("https://www.luv2test.com/#/file-upload");
        waitInSeconds(2);

        // file uploads for files field using absolute path
        WebElement fileFiled = driver.findElement(By.xpath("//input[@type='file' and @class='hidden']"));
        fileFiled.sendKeys("/Users/luv2code/IdeaProjects/java-selenium-testng/src/main/resources/files/can_do.jpg");

        waitInSeconds(2);
        driver.navigate().refresh();
        waitInSeconds(2);

        // upload file using relative path to your file
        String path = System.getProperty("user.dir");
        String filePath = path + "/src/main/resources/files/butterfly.webp";
        System.out.println("RELATIVE PATH: " + filePath);

        driver.findElement(By.xpath("//input[@type='file' and @class='hidden']")).sendKeys(filePath);


    }
}
