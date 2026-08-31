package org.luv2code.O7_locators_real_time_challenges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathTest extends BaseTest {
    @Test
    public void xpathTest() {

        // Navigate to Registration Form test
        driver.navigate().to("https://luv2test.com/#/registration-form");

        // 1. XPath By Tag Name
        driver.findElement(By.xpath("//input"));

        // 2. XPath By ID
        driver.findElement(By.xpath("//*[@id='fullName']"));

        // 3. XPath By Class Name
        driver.findElement(By.xpath("//*[contains(@class,'w-32')]"));

        // 4. XPath By Attribute
        driver.findElement(By.xpath("//*[@type='password']"));

        // 5. XPath By Tag + Class
        driver.findElement(By.xpath("//input[@class='accent-blue-500']"));

        // 6. XPath By Tag + ID
        driver.findElement(By.xpath("//input[@id='profilePicture']"));

        // 7. XPath By Tag + Attribute
        driver.findElement(By.xpath("//input[@type='file']"));

        // 8. XPath By Multiple Attributes
        driver.findElement(By.xpath("// input[@type='radio' and @id='gender-male']"));

        // 9. XPath By Starts With
        driver.findElement(By.xpath("//input[starts-with(@name, 'full')]"));

        // 10. XPath By Ends With
        driver.findElement(By.xpath("//input[substring(@name, string-length(@name) - string-length('Name') + 1) = 'Name']"));

        // 11. XPath By Contains
        driver.findElement(By.xpath("//input[contains(@name, 'Num')]"));

        // 12. XPath By Direct Child
        driver.findElement(By.xpath("//div/h1"));

        // 13. XPath By Descendant
        driver.findElement(By.xpath("//div//p"));

        // 14. XPath By Immediate Sibling
        driver.findElement(By.xpath("//label/following-sibling::label[1]"));

        // 15. XPath By General Sibling
        driver.findElement(By.xpath("//button/following-sibling::div"));

        // 16. XPath By Not Selector
        driver.findElement(By.xpath("//button[not(@type='submit')]"));

        // 17. XPath By nth-child (second child)
        driver.findElement(By.xpath("//ul/li[2]"));

        // 18. XPath By first-child
        driver.findElement(By.xpath("//ul/li[1]"));

        // 19. XPath By last-child
        driver.findElement(By.xpath("//ul/li[last()]"));

    }
}
