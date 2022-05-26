package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C44FileUploadMYSELF extends TestBaseClass {
    @Test
    public void ders() {

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadButton = driver.findElement(By.xpath("//input[@id='file-upload']"));

        String sysPath = System.getProperty("user.home");
        String filePath = sysPath+ "/Desktop/JavaProje.txt";

        uploadButton.sendKeys(filePath);

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();
    String itisDone= driver.findElement(By.xpath("//*[text()='File Uploaded!']")).getText();
        System.out.println(itisDone);
        Assert.assertEquals(itisDone,"File Uploaded!");

    }
}
