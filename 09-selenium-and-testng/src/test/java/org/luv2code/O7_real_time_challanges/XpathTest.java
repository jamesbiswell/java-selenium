package org.luv2code.O7_real_time_challanges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathTest extends BaseTest {
    @Test
    public void xpathTest() {

        // navigate to Registration Form test
        driver.navigate().to("https://luv2test.com/#/registration-form");

        // 1. XPath By Tag Name
        driver.findElement(By.xpath("//input"));

        // 2. XPath By ID
        driver.findElement(By.xpath("//*[@id='fullName']"));

        // 3. XPath By Class Name
        driver.findElement(By.xpath("//*[contains(@class,'w-32')]"));

        // 4. XPath By Attribute
        driver.findElement(By.xpath("//*[@type='password']"));

        // 5. XPath Tag + Class
        driver.findElement(By.xpath("//input[@class='accent-blue-500']"));

        // 6. XPath Tag + ID
        driver.findElement(By.xpath("//input[@id='profilePicture']"));

        // 7. XPath Tag + Attribute
        driver.findElement(By.xpath("//input[@type='file']"));

        // 8. XPath Multiple Attributes
        driver.findElement(By.xpath("// input[@type='radio' and @id='gender-male']"));

        // 9. XPath Starts With
        driver.findElement(By.xpath("//input[starts-with(@name, 'full')]"));

        // 10. XPath Ends With
        driver.findElement(By.xpath("//input[substring(@name, string-length(@name) - string-length('Name') + 1) = 'Name']"));

        // 11. XPath Contains
        driver.findElement(By.xpath("//input[contains(@name, 'Num')]"));

        // 12. XPath Direct Child
        driver.findElement(By.xpath("//div/h1"));

        // 13. XPath Descendant
        driver.findElement(By.xpath("//div//p"));

        // 14. XPath Immediate Sibling
        driver.findElement(By.xpath("//label/following-sibling::label[1]"));

        // 15. XPath General Sibling
        driver.findElement(By.xpath("//button/following-sibling::div"));

        // 16. XPath Not Selector
        driver.findElement(By.xpath("//button[not(@type='submit')]"));

        // 17. XPath nth-child (second child)
        driver.findElement(By.xpath("//ul/li[2]"));

        // 18. XPath first-child
        driver.findElement(By.xpath("//ul/li[1]"));

        // 19. XPath last-child
        driver.findElement(By.xpath("//ul/li[last()]"));

    }
}
