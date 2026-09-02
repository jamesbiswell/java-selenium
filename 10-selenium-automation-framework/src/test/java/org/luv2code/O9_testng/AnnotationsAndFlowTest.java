package org.luv2code.O9_testng;

import org.testng.annotations.*;

public class AnnotationsAndFlowTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite - Initialize DB/Config");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite - Disconnect DB/Config Report");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest - Launch Browser");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest - Close Browser");
    }

    @BeforeGroups("smoke")
    public void beforeGroup() {
        System.out.println("@BeforeGroups - Setup for smoke tests");
    }


    @AfterGroups("smoke")
    public void afterGroup() {
        System.out.println("@AfterGroups - Cleanup for smoke tests");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass - Create Test Data");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass - Delete Test Data");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod - Login before test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod - Logout after test");
    }

    @Test(groups="smoke")
    public void testCase1() {
        System.out.println("@Test - Execute Test Case 1");
    }



}
