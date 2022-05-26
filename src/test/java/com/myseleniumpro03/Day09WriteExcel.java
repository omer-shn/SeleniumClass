package com.myseleniumpro03;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day09WriteExcel {
    @Test
    public void writeExcel() throws IOException {
      //  FileInputStream >>Workbook >>Sheet >>Row >> Cell
        //Yukarıdaki bu sıralmayı excel files için değişmez
        String path = "./src/test/java/recourses/capital.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 =workbook.getSheetAt(0);
        Row row1 = sheet1.getRow(0);
        Cell r1c3 = row1.createCell(2); //to read getcell() is used

        //now we are beginning to enter on that cell
        r1c3.setCellValue("POPULATION"); //we wrote "POPULATION" but is not saved
        sheet1.getRow(1).createCell(2).setCellValue("150000");
        sheet1.getRow(2).createCell(2).setCellValue("250000");
        sheet1.getRow(3).createCell(2).setCellValue(54000); //we can also write like int
        FileOutputStream fileOutputStream = new FileOutputStream(path);//to upload
        workbook.write(fileOutputStream);

        //if we want to close
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();





    }
}
