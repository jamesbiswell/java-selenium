package org.luv2code.O9_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {

    @Test
    public void allAssertionsTest() {

        // 1. assertEquals - compare values
        String expected = "Luv2Test";
        String actual = "Luv2Test";
        Assert.assertEquals(actual, expected);

        // 2. assertNotEquals - values must differ
        int a = 5, b = 10;
        Assert.assertNotEquals(a, b);

        // 3. assertTrue - condition must be true
        Assert.assertTrue(5 < 10, "Condition should be true!");

        // 4. assertFalse - condition must be false
        Assert.assertFalse(5 > 10, "Condition should be false!");

        // 5. assertNull - object must be null
        String strNull = null;
        Assert.assertNull(strNull, "Object should be null");

        // 6. assertNotNull - object must not be null
        String strNotNull = "Luv2Test";
        Assert.assertNotNull(strNotNull);

        // 7. assertSame - must be same reference
        String str1 = "Luv2Code";
        String str2 = str1;
        Assert.assertSame(str1, str2, "Object are not reference");

        // 8. assertNotSame - must be different objects
        String str3 = new String("Luv2Code");
        String str4 = new String("Luv2Code");
        Assert.assertNotSame(str3, str4);

        // 9. SoftAssert - multiple validation together
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Title", "Dashboard", "Title Mismatch!");
        softAssert.assertTrue(5 > 10, "Condition failed!");
        softAssert.assertNotNull(null, "Object should not be null!");

        // collects all the failure at the end
        softAssert.assertAll();

        // 10. fail() - forcefully fail test
//        Assert.fail("Forcefully failing this test!");



    }

}
