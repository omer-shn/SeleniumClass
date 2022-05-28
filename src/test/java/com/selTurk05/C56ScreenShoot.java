package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class C56ScreenShoot extends TestBaseClass {
    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.amazon.com");
        //First create an onject
        TakesScreenshot ts = (TakesScreenshot)  driver;
        //create a new file
        File allPagePicture= new File("target/screenPicture/allPage.jpeg");
        //Geçici-Temp dosyası oluştur
        File tempFile = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tempFile,allPagePicture);


    }
}
