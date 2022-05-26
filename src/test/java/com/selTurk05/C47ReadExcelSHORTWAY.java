package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C47ReadExcelSHORTWAY {
    @Test
    public void readExcelTest() throws IOException {
        String filepath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filepath);
        Workbook workbook = WorkbookFactory.create(fis);

        //this gives also "OSLO" by short way

     String osloData=   workbook.getSheet("Sayfa1").getRow(12).getCell(1).toString();
        System.out.println(osloData);



        // if we create a sheet command we use below order
        //String rlc2 = sheet1.getRow(1).getCell(0).toString();


    }
}
