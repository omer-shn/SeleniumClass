package com.selTurk05;

import com.myseleniumpro02.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class C58IstenenWebElementSS extends TestBase {
    @Test
    public void webElementSS() throws IOException {

        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
        searchBox.sendKeys("Nutella"+ Keys.ENTER);

        WebElement resultNumberElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        File resultNumber= new File("target/screenPicture/resultWriting.jpeg");
        File temp = resultNumberElement.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,resultNumber);

            //Aynı Dosyayı İkinci Bir noktaya (Resimler Klasörü) kaydetmek için bu iki satır yeterli
        File resultNumberrr= new File("/Users/pc/Pictures/NutellaResult.jpeg");
        FileUtils.copyFile(temp,resultNumberrr);



    }
}
