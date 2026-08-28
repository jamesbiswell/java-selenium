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

        // find an email in dynamic table
        driver.findElement(By.xpath("//td[text()='jeeva@example.com']"));
        WebElement email = driver.findElement(By.xpath("//td[1][text()='1']/../td[text()='jeeva@example.com']"));
        highlightElement(email);
        String userEmail = email.getText();
        System.out.println("\nEMAIL ADDRESS: " + userEmail);

        // find all emails and print them
        System.out.println("\nALL EMAIL ADDRESSES:");
        for (int i = 1; i <= 10; i++) {
            String locator = MessageFormat.format("//td[1][text()=''{0}'']/../td[3]", i);
            WebElement allEmailAddress = driver.findElement(By.xpath(locator));
            System.out.println(allEmailAddress.getText());
        }

        // locate the table
        WebElement table = driver.findElement(By.id("dynamic-table"));

        // get all rows from table
        List<WebElement> allRows = table.findElements(By.xpath("//tbody/tr"));
        System.out.println("\nTotal Rows: " + allRows.size());

        // get all columns from table
        List<WebElement> allCols = table.findElements(By.xpath("//thead/tr/th"));
        System.out.println("Total Columns: " + allCols.size());
        System.out.println();

        // print all table data
        for (int i = 1; i <= allRows.size(); i++) {
            for (int j = 1; j <= allCols.size(); j++) {
                String cellXPath = "//tbody/tr["+i+"]/td["+j+"]";
                WebElement cell = table.findElement(By.xpath(cellXPath));
                if (j == allCols.size()) {
                    System.out.print(cell.getText());
                } else {
                    System.out.print(cell.getText() + " | ");
                }
            }
            System.out.println();
        }
        
    }
}
