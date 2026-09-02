package org.luv2code.O4_actions;

import org.luv2code.framework.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdownsTest extends BaseTest {
    @Test
    public void handlingDropdownTest() {

        // Navigate to Dropdown page
        driver.navigate().to("https://www.luv2test.com/#/dropdowns");

        // Normal Dropdown
        WebElement fruitListDropdown = driver.findElement(By.id("normal-dropdown"));
        Select select = new Select(fruitListDropdown);
        select.selectByVisibleText("Apple");

        // Multi-select Dropdown
        WebElement fruitListMultiSelectDropdown = driver.findElement(By.id("multi-dropdown"));
        Select multiSelect = new Select(fruitListMultiSelectDropdown);
        // select by value
        multiSelect.selectByValue("apple");
        // select by index
        multiSelect.selectByIndex(4);
        // select by visible text
        multiSelect.selectByVisibleText("Grapes");

//        // Deselect by visible text
//        multiSelect.deselectByVisibleText("Apple");
//        // deselect by value
//        multiSelect.deselectByValue("grapes");
//        // deselect by index
//        multiSelect.deselectByIndex(4);

        // Select & Add dropdown
        WebElement addOptionField = driver.findElement(By.id("add-option-input"));
        addOptionField.sendKeys("C++");
        driver.findElement(By.id("add-option-button")).click();
        WebElement addableDropdown = driver.findElement(By.id("addable-dropdown"));
        Select addableSelect = new Select(addableDropdown);
        addableSelect.selectByVisibleText("C++");

        // Searchable Dropdown
        WebElement searchField = driver.findElement(By.id("search-input"));
        searchField.sendKeys("Python");
        WebElement searchableDropdown = driver.findElement(By.id("searchable-dropdown"));
        Select searchSelect = new Select(searchableDropdown);
        searchSelect.selectByVisibleText("Python");

        // Language Selector (Hover to Open) dropdown
        WebElement hoverMenu = driver.findElement(By.xpath("//div[text()='Hover over this box to choose a language']"));

        // Create Actions class instance
        Actions actions = new Actions(driver);
        // perform mouse hover
        actions.moveToElement(hoverMenu).perform();

        // wait and click on one of the dropdown items
        WebElement dropdownItem = driver.findElement(By.xpath("//li[text()='Go']"));
        dropdownItem.click();

        // move mouse to another element to "hove away"
        WebElement otherElement = driver.findElement(By.tagName("body"));
        actions.moveToElement(otherElement).perform();

    }
}
