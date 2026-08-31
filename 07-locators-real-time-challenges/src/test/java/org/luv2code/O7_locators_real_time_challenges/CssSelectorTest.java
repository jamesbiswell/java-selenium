package org.luv2code.O7_locators_real_time_challenges;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CssSelectorTest extends BaseTest {
    @Test
    public void cssSelector() {

        // Navigate to "Registration Form" page
        driver.navigate().to("https://luv2test.com/#/registration-form");

        // 1. CSS Selector by Tag Name
        WebElement allInputTags = driver.findElement(By.cssSelector("input"));
        highlightElement(allInputTags);
        waitInSeconds(2);

        // 2. CSS Selector By ID
        WebElement fullNameTextField = driver.findElement(By.cssSelector("#fullName"));
        highlightElement(fullNameTextField);
        waitInSeconds(2);
        
        // 3. CSS Selector By Class Name
        WebElement allLabels = driver.findElement(By.cssSelector(".w-32.text-right.font-medium"));
        highlightElement(allLabels);
        waitInSeconds(2);

        // 4. CSS Selector By Attributes
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        highlightElement(passwordField);
        waitInSeconds(2);

        // 5. CSS Selector By Tag + Class
        WebElement acceptTermsCheckbox = driver.findElement(By.cssSelector("input.accent-blue-500"));
        highlightElement(acceptTermsCheckbox);
        waitInSeconds(2);

        // 6. CSS Selector By Tag + ID
        WebElement chooseFileField = driver.findElement(By.cssSelector("input#profilePicture"));
        highlightElement(chooseFileField);
        waitInSeconds(2);

        // 7. CSS Selector By Tag + Attribute
        WebElement chooseFileField2 = driver.findElement(By.cssSelector("input[type='file']"));
        highlightElement(chooseFileField2);
        waitInSeconds(2);

        // 8. CSS Selector By Multiple Attributes
        WebElement maleGenderRadioButton = driver.findElement(By.cssSelector("input[type='radio'][id='gender-male']"));
        highlightElement(maleGenderRadioButton);
        waitInSeconds(2);

        // 9. CSS Selector By Starts With (^)
        WebElement fullNameTextField2 = driver.findElement(By.cssSelector("input[name^='full']"));
        highlightElement(fullNameTextField2);
        waitInSeconds(2);

        // 10. CSS Selector By Ends With ($)
        WebElement fullNameTextField3 = driver.findElement(By.cssSelector("input[name$='Name']"));
        highlightElement(fullNameTextField3);
        waitInSeconds(2);

        // 11. CSS Selector By Contains (*)
        WebElement phoneNumberTextField = driver.findElement(By.cssSelector("input[name*='Num']"));
        highlightElement(phoneNumberTextField);
        waitInSeconds(2);

        // 12. CSS Selector By Direct Child (>)
        WebElement pageHeading = driver.findElement(By.cssSelector("div > h1"));
        highlightElement(pageHeading);
        waitInSeconds(2);

        // 13. CSS Selector By Descendant (Space)
        WebElement pageDescription = driver.findElement(By.cssSelector("div p"));
        highlightElement(pageDescription);
        waitInSeconds(2);

        // 14. CSS Selector By Immediate Sibling (+)
        WebElement femaleGenderRadioButton = driver.findElement(By.cssSelector("label + label"));
        highlightElement(femaleGenderRadioButton);
        waitInSeconds(2);

        // 15. CSS Selector By General Sibling (~)
        WebElement generalSibling = driver.findElement(By.cssSelector("button ~ div"));
        highlightElement(generalSibling);
        waitInSeconds(2);

        // 16. CSS Selector By 'not' selector
        WebElement notSubmitButton = driver.findElement(By.cssSelector("button:not([type='submit'])"));
        highlightElement(notSubmitButton);
        waitInSeconds(2);

        // 17. CSS Selector By 'nth-child'
        WebElement nthChildSideNavLinks =  driver.findElement(By.cssSelector("ul li:nth-child(2)"));
        highlightElement(nthChildSideNavLinks);
        waitInSeconds(2);

        // 18. CSS Selector By 'first-child'
        WebElement firstChildSideNavLinks = driver.findElement(By.cssSelector("ul li:first-child"));
        highlightElement(firstChildSideNavLinks);
        waitInSeconds(2);

        // 19. CSS Selector By 'last-child'
        WebElement lastChildSideNavLinks = driver.findElement(By.cssSelector("ul li:last-child"));
        highlightElement(lastChildSideNavLinks);
        waitInSeconds(2);

    }
}
