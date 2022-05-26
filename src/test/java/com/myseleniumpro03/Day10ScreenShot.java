package com.myseleniumpro03;

import com.myseleniumpro02.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day10ScreenShot extends TestBase {

    public void takeScreenShot() throws IOException {
        File image =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        /*Alternatif Way
        TakesScreenshot ts=(TakesScreenshot)driver;
        File image =ts.getScreenshotAs(OutputType.FILE);
        */
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        System.out.println(currentDate);


        String path =System.getProperty("user.dir")+"/test-output/Screenshots/"+currentDate+"test-image.png";
      //  String path =System.getProperty("user.dir")+"/test-output/Screenshots/test-image.png";
        File finalpath =new File(path);
        FileUtils.copyFile(image,finalpath);
    }
    @Test
    public void secreenShotTest() throws IOException {
        driver.get("https://www.google.com");
        takeScreenShot();

        driver.findElement(By.name("q")).sendKeys("tesla cybertruck"+ Keys.ENTER);
    }
}
