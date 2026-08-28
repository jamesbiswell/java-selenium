package org.luv2code.O3_quick_start;

import org.luv2code.base.BaseTest;
import org.testng.annotations.Test;

public class NavigationCommandsTest extends BaseTest {

    @Test
    public void navigationCommandsTest() {

        // 1. Open a specific URL (dynamic table)
        driver.get("https://www.luv2test.com/#/tables");

        // 2. Navigate to a URL (home page)
        driver.navigate().to("https://www.luv2test.com/#/");

        // 3. Go back to the previous page in browser history
        driver.navigate().back();

        // 4. Go forward to the next page in browser history
        driver.navigate().forward();

        // 5. Refresh the current page
        driver.navigate().refresh();

    }

}
