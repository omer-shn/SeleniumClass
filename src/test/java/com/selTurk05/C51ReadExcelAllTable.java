package com.selTurk05;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C51ReadExcelAllTable {
    @Test
    public void ReadExcelTest() throws IOException {
        String filePath = "src\\test\\java\\recourses\\Crops.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook= WorkbookFactory.create(fis);

        Map<String,String> cropsMap = new HashMap<>();
        int lastRowIndex = workbook.getSheet("Sayfa1").getLastRowNum();

        //WEE NEED A KEY & A VALUE !!!!!
        for(int i=0;i<=lastRowIndex;i++) {
            String key =workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String value =workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString()
                    +"<>"
                    +workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString();
            //And Add this Result to MaP
            cropsMap.put(key,value);
            System.out.println(key+","+value);
        }
        // to see on console
        System.out.println(cropsMap);

        Assert.assertTrue(cropsMap.keySet().contains("WHEAT"));
    }
}
