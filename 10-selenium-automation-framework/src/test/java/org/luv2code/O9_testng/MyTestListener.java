package org.luv2code.O9_testng;

import org.apache.commons.io.FileUtils;
import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class MyTestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

        // Take Screenshot
        File src = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "target/failure-screenshot/" + result.getName() + ".png";
        File destFile = new File(screenshotPath);
        try {
            FileUtils.copyFile(src, destFile);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

}
