package com.myseleniumpro03;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day10Tables extends TestBase {

    @Test
    public void printTable() {

        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print Table*****");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());

        //One by one
        List<WebElement> insideTable = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachdata : insideTable) {
            System.out.println(eachdata.getText());
        }
    }

    @Test  // to get all rows
    public void getRows() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print Rows*****");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        for (WebElement eachrow : allRows) {
            System.out.println(eachrow.getText());
        }
        //if we want to get one of them we can do it
        System.out.println("Second row >>>>>>>>>>>>>" + allRows.get(2).getText());
    }

    @Test  // to get last row
    public void getLastRow() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print LastRows*****");
        WebElement lastRow = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]"));
        System.out.println(lastRow);
    }

    @Test
    public void getColumn5() {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print Column5*****");
        List<WebElement> column5Data = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
        for (WebElement eachColumn : column5Data) {
            System.out.println(eachColumn.getText());
        }
    }

    @Test  // This time we did with a method and Dynamic xpath
    public void printDataTest() {
        //We can use a lot of methods and  mulply exampls
        printData(2,3);
        printData(4,6);

        printData1(2,4,"table2");
        printData1(2,5,"table2");
    }
    public void printData(int row , int column) {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print DynamicRow & Column *****");

        String xPath = "//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";//this is dynamic xpath
        WebElement cellData = driver.findElement(By.xpath(xPath));
        System.out.println(cellData.getText());
    }

    public void printData1(int row , int column,String tableID) {
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("*****Print DynamicResult*****");

        String xPath = "//table[@id='"+tableID+"']//tbody//tr["+row+"]//td["+column+"]";//this is dynamic xpath
        WebElement cellData = driver.findElement(By.xpath(xPath));
        System.out.println(cellData.getText());
    }


}

