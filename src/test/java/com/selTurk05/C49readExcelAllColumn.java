package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C49readExcelAllColumn {
    @Test
    public void readExcelTest() throws IOException {

        String filePath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook= WorkbookFactory.create(fis);

        int lastRow =workbook.getSheet("Sayfa1").getLastRowNum();
        System.out.println(lastRow);
        String DataInRow;

        for (int i =0; i<=lastRow;i++) {
            DataInRow= C48ReadExcelDYNAMIC.getMeData(i,0);
            System.out.println(DataInRow);
        }

    }
}
