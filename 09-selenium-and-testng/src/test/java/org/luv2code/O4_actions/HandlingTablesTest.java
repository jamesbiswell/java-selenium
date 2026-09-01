package org.luv2code.O4_actions;

import org.luv2code.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.MessageFormat;
import java.util.List;

public class HandlingTablesTest extends BaseTest {
    @Test
    public void handlingTablesTest() {

        // navigate to Dynamic Tables page
        driver.navigate().to("https://www.luv2test.com/#/tables");

        // find a email in dynamic table
        driver.findElement(By.xpath("//td[text()='jeeva@example.com']"));
        WebElement email = driver.findElement(By.xpath("//td[1][text()='1']/../td[text()='jeeva@example.com']"));
        highlightElement(email);
        String userEmail = email.getText();
        System.out.println("\nEMAIL ADDRESS: " + userEmail);
        System.out.println();

        // find all email and print them
        for (int i = 1; i <= 10; i++) {
            String locator = MessageFormat.format("//td[1][text()=''{0}'']/../td[3]", i);
            WebElement allEmailAddress = driver.findElement(By.xpath(locator));
            System.out.println("ALL EMAIL ADDRESS: " + allEmailAddress.getText());
        }

        // locate the table
        WebElement table = driver.findElement(By.id("dynamic-table"));

        // get all rows from table
        List<WebElement> allRows = table.findElements(By.xpath("//tbody/tr"));
        System.out.println("Total Rows: " + allRows.size());

        // get all columns from table
        List<WebElement> allCols = table.findElements(By.xpath("//thead/tr/th"));
        System.out.println("Total Columns: " + allCols.size());

        // print all table data
        for(int i = 1; i <= allRows.size(); i++) {
            for(int j = 1; j <= allCols.size(); j++) {
                String cellXPath = "//tbody/tr["+i+"]/td["+j+"]";
                WebElement cell = table.findElement(By.xpath(cellXPath));
                System.out.println(cell.getText() + " | ");
            }
            System.out.println();
        }



    }
}
