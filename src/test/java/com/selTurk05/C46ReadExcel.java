package com.selTurk05;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C46ReadExcel {
    @Test
    public void readExcel() throws IOException {
        String filePath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet =workbook.getSheet("Sayfa1");
        Row row =sheet.getRow(12);
        Cell cell =row.getCell(2);
      //  System.out.println(cell);

        Cell cell1 =row.getCell(1);
        Row row1 =sheet.getRow(0);
        Cell cell2 =row1.getCell(2);
        System.out.println(cell1 +" "+cell+" "+cell2);

        //Assert Time!!!!!
        String expectedData ="Oslo";
        String actualData =cell1.toString();
        Assert.assertEquals(expectedData,actualData);

    }
}
