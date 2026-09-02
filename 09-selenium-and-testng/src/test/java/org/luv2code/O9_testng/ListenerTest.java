package org.luv2code.O9_testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// can use <listeners> in testng.xml or annotate like this
@Listeners(MyTestListener.class)
public class ListenerTest {

    @Test
    public void successTest() {
        System.out.println("This is my successTest() Test");
    }

    @Test
    public void failedTest() {
        System.out.println("This is my failedTest() Test");
        Assert.assertEquals(2, 3);
    }

    @Test
    public void skippedTest() {
        System.out.println("This is my skippedTest() Test");
        throw new SkipException("Skipping this test deliberately");
    }

}
