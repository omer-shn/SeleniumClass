package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C55WriteExcel {
    @Test
    public void writeExcelTest() throws IOException {
        String dosyaYolu = "src/test/java/recourses/capital.xlsx";
        FileInputStream fis =new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        //create a new cell
        workbook.getSheet("Sayfa1").getRow(0).createCell(3).setCellValue("IncreaseRate");
        // input a population number
        workbook.getSheet("Sayfa1").getRow(1).createCell(3).setCellValue("4%");
        workbook.getSheet("Sayfa1").getRow(2).createCell(3).setCellValue("3%");
        workbook.getSheet("Sayfa1").getRow(3).createCell(3).setCellValue("7%");
        // save the inputs
        FileOutputStream fos =new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        //And close the file
        workbook.close();
        fis.close();
        fos.close();

    }
}
