package com.myseleniumpro03;

import com.myseleniumpro02.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Day10ScreenShotSpecificElements extends TestBase {

    @Test
    public void screenshotTest() throws IOException {


        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);

//        Saving the image to  the path
//        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File finalPath = new File("./test-output/elements/googleLogo.png");
        FileUtils.copyFile(logoImage,finalPath);

//        getting screenshot of sign in element
     //   WebElement signInButton = driver.findElement(By.xpath("//*[.='Sign in']"));
        WebElement signInButton = driver.findElement(By.xpath("(//input[@value='Kendimi Şanslı Hissediyorum'])[2]"));
        File signInImage = signInButton.getScreenshotAs(OutputType.FILE);
        File signInPath = new File("./test-output/elements/signIn.png");
        FileUtils.copyFile(signInImage,signInPath);
    }

}
