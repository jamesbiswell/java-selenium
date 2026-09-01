package org.luv2code.O7_real_time_challanges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CssSelectorTest extends BaseTest {
    @Test
    public void cssSelector() {

        // navigate to "Registration Form" page
        driver.navigate().to("https://luv2test.com/#/registration-form");

        // 1. Css Selector by Tag Name
        WebElement allInputTags = driver.findElement(By.cssSelector("input"));
        highlightElement(allInputTags);

        // 2. Css Selector By ID
        WebElement fullNameTextField = driver.findElement(By.cssSelector("#fullName"));
        highlightElement(fullNameTextField);

        // 3. Css Selector By Class Name
        WebElement allLabels = driver.findElement(By.cssSelector(".w-32.text-right.font-medium"));
        highlightElement(allLabels);

        // 4. Css Selector By Attributes
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        highlightElement(passwordField);

        // 5. Css Selector Tag + Class
        WebElement acceptTermsCheckbox = driver.findElement(By.cssSelector("input.accent-blue-500"));
        highlightElement(acceptTermsCheckbox);

        // 6. Css Selector Tag + ID
        WebElement chooseFileField = driver.findElement(By.cssSelector("input#profilePicture"));
        highlightElement(chooseFileField);

        // 7. Css Selector Tag + Attribute
        WebElement chooseFileField2 = driver.findElement(By.cssSelector("input[type='file']"));
        highlightElement(chooseFileField2);

        // 8. Css Selector Multiple Attributes
        WebElement mailGenderRadioButton = driver.findElement(By.cssSelector("input[type='radio'][id='gender-male']"));
        highlightElement(mailGenderRadioButton);

        // 9. Css Selector Starts With (^)
        WebElement fullNameTextField2 = driver.findElement(By.cssSelector("input[name^='full']"));
        highlightElement(fullNameTextField2);

        // 10. Css Selector Ends With ($)
        WebElement fullNameTextField3 = driver.findElement(By.cssSelector("input[name$='Name']"));
        highlightElement(fullNameTextField3);

        // 11. Css Selector Contains (*)
        WebElement phoneNumberTextField = driver.findElement(By.cssSelector("input[name*='Num']"));
        highlightElement(phoneNumberTextField);

        // 12. Css Selector Direct Chile (>)
        WebElement pageHeading = driver.findElement(By.cssSelector("div > h1"));
        highlightElement(pageHeading);

        // 13. Css Selector Descendant (space)
        WebElement pageDescription = driver.findElement(By.cssSelector("div p"));
        highlightElement(pageDescription);

        // 14. Css Selector Immediate sibling (+)
        WebElement femaleGenderRadioButton = driver.findElement(By.cssSelector("label + label"));
        highlightElement(femaleGenderRadioButton);

        // 15. Css Selector General Sibling (~)
        WebElement generalSibling = driver.findElement(By.cssSelector("button ~ div"));
        highlightElement(generalSibling);

        // 16. Css Selector Not selector
        WebElement notSubmitButton = driver.findElement(By.cssSelector("button:not([type='submit'])"));
        highlightElement(notSubmitButton);

        // 17. Css Selector nth-child
        WebElement nthChildSideNavLinks =  driver.findElement(By.cssSelector("ul li:nth-child(2)"));
        highlightElement(nthChildSideNavLinks);

        // 18. Css Selector first-child
        WebElement firstChildSideNavLinks = driver.findElement(By.cssSelector("ul li:first-child"));
        highlightElement(firstChildSideNavLinks);

        // 19. Css Selector last-child
        WebElement lastChildSideNavLinks = driver.findElement(By.cssSelector("ul li:last-child"));
        highlightElement(lastChildSideNavLinks);

    }
}
