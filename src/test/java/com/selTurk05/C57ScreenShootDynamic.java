package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C57ScreenShootDynamic extends TestBaseClass {
    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.amazon.com");

        TakesScreenshot ts = (TakesScreenshot)  driver;
        //For Dynamic add time  FIRST WAY
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        System.out.println(currentDate);

            //SECOND WAY
       //  LocalDateTime date =LocalDateTime.now();
      //   DateTimeFormatter dtf =DateTimeFormatter.ofPattern("YYMMddHHmmss");
      //  String tarih =date.format(dtf);

            //Kayıt yeri fakat Rsimle klasörünede kayıt eildiğinde burası yoruma alındı
     //  File allPagePicture= new File("target/screenPicture/allPage"+currentDate+".jpeg");

        //FOR SACER ON RESİMLER FİLES
        File amazonn= new File("/Users/pc/Pictures/amazonn"+currentDate+".jpeg");

        File tempFile = ts.getScreenshotAs(OutputType.FILE);
     //   FileUtils.copyFile(tempFile,allPagePicture);
        FileUtils.copyFile(tempFile,amazonn);


    }
}
