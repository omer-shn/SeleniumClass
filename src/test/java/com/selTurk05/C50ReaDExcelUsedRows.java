package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C50ReaDExcelUsedRows {
    @Test
    public void ReadExcelTest() throws IOException {

        String filepath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filepath);
        Workbook workbook = WorkbookFactory.create(fis);

        //to get last row
        int lastRow =workbook.getSheet("Sayfa2").getLastRowNum();
        int expectedRowNum = 14;
        Assert.assertEquals(expectedRowNum,lastRow);

            // to get used row
        int usedRowsNum =workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        int expectedUsed =11;
        Assert.assertEquals(expectedUsed,usedRowsNum);
    }
}
