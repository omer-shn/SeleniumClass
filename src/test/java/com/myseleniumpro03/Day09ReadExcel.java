package com.myseleniumpro03;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day09ReadExcel {
    @Test
    public void readExcel() throws IOException {

        String path = "./src/test/java/recourses/capital.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);

        //if we want other cell
        Cell cell2 = row1.getCell(1);
        System.out.println(cell2);
        //if we want second row firs cell
        String rlc2 = sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals("USA", rlc2);
        System.out.println(rlc2);
        //if we want third row second cell
        String r3c2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(r3c2);
        //Finf the number of last row
        int numberOfRow = sheet1.getLastRowNum()+1;
        System.out.println(numberOfRow);
        // if there is gab cell, it dosent seen. Only full cell.
        int numberOfUsed =sheet1.getPhysicalNumberOfRows();// boşluk varsa görmez, sadece yazılı satırlar
        System.out.println(numberOfUsed);
        //if we want all first row
        Map<String,String> countryCapitals = new HashMap<>();
        for(int rowNumber=1;rowNumber<numberOfRow;rowNumber++) {
            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
            System.out.println(countries);
            //if we want all second row
            String capitals = sheet1.getRow(rowNumber).getCell(1).toString();
            System.out.println(capitals);
            //if we want side by side
            countryCapitals.put(countries,capitals);
        }
        System.out.println(countryCapitals);

    }
}
