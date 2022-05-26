package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C48ReadExcelDYNAMIC {
    @Test
    public void readExcel() throws IOException {

        int rowNumber =10;
        int columnNumber=1;
        String expectedData ="MEKKE";
        String actualData =getMeData(rowNumber,columnNumber);
        Assert.assertEquals(expectedData,actualData);


    }
    public static String getMeData (int satirIndex, int sutunIndex) throws IOException {
        String wantedData = "";
        String filepath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filepath);
        Workbook workbook = WorkbookFactory.create(fis);
        wantedData = workbook.getSheet("Sayfa1").getRow(satirIndex).getCell(sutunIndex).toString();

        return  wantedData;
    }


}
