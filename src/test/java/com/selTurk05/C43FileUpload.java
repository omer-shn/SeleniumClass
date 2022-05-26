package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C43FileUpload extends TestBaseClass {
    @Test
    public void test01() {
      driver.get("https://the-internet.herokuapp.com/upload");

        //upload işlemi selenium komutlarıyla direk yaplamaz
        //bu nedenle sendKeys() kullanılarak upload edilmek istenen dosyanın yolu send edilmelidir.
        WebElement choosefileButton =driver.findElement(By.xpath("//input[@id='file-upload']")); // önce locate

        //dosya yolunu oluştur

       String ThisChabgeableforComputer = System.getProperty("user.home");
      String ThisCommon ="//Desktop//JavaProje.txt";
      String uploadFile = ThisChabgeableforComputer+ThisCommon;


        //sendKeys ile yukarda oluşturulan dosya yolunu gönder
        choosefileButton.sendKeys(uploadFile);
      //  WebElement upload = driver.findElement(By.id("file-submit"));
       // upload.click();
        WebElement upload = driver.findElement(By.tagName("h3"));
        upload.click();

        Assert.assertTrue(upload.isDisplayed());

    }
}
