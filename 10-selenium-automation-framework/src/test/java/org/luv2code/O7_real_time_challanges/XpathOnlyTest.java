package org.luv2code.O7_real_time_challanges;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathOnlyTest extends BaseTest {
    @Test
    public void xpathOnlyTest() {

        // navigate to Registration Form page
        driver.navigate().to("https://luv2test.com/#/registration-form");

        // 1. Navigate Up the DOM (Parent Axis)
        driver.findElement(By.xpath("//input[@id='fullName']/parent::div/../label"));

        // 2. Navigate to Ancestors (grandparents, etc.)
        driver.findElement(By.xpath("//input[@id='fullName']/ancestor::form"));

        // 3. Select Based on Text Content
        driver.findElement(By.xpath("//button[text()='Submit']"));
        driver.findElement(By.xpath("//button[contains(text(), 'Sub')]"));

        // 4. Complex Logical Conditions (and, or)
        driver.findElement(By.xpath("//input[@type='radio' and @id='gender-male']"));
        driver.findElement(By.xpath("//input[@type='radio' or @id='gender-male']"));

        // 5. Position-Based Indexing
        driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

        // 6. Advanced Functions (substring, normalize-space)
        driver.findElement(By.xpath("//input[substring(@name, string-length(@name) - string-length('Name') + 1) = 'Name']"));
        driver.findElement(By.xpath("//label[normalize-space(text()='Full Name:')]"));

        // 7. Axes Navigation preceding-sibling, following, descendant, self ...
        driver.findElement(By.xpath("//label[preceding-sibling::label]"));
        driver.findElement(By.xpath("//input[@id='email']/following::button[1]"));
        driver.findElement(By.xpath("//input/ancestor::form"));
        driver.findElement(By.xpath("//input/ancestor-or-self::form"));
        driver.findElement(By.xpath("//input/parent::div"));
        driver.findElement(By.xpath("//form/child::div"));
        driver.findElement(By.xpath("//label/following-sibling::label"));
        driver.findElement(By.xpath("//label/preceding-sibling::label"));
        driver.findElement(By.xpath("//label/following::input"));
        driver.findElement(By.xpath("//label/following::input"));
        driver.findElement(By.xpath("//input/preceding::label"));
        driver.findElement(By.xpath("//input/self::input"));

    }
}
