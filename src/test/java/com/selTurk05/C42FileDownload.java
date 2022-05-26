package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C42FileDownload extends TestBaseClass {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/download");
      WebElement dummyfile = driver.findElement(By.xpath("//a[text()='dummy.txt']"));
      dummyfile.click();

      //Dosya yolu bulmak ve işlem yapmak için
        String ThisChabgeableforComputer = System.getProperty("user.home");
        String ThisCommon ="//Downloads//dummy.txt";
        String searchingPath = ThisChabgeableforComputer+ThisCommon;
        // şimdide dosya varmı assert edilir
        Assert.assertTrue(Files.exists(Paths.get(searchingPath)));


        }
}
   //https://the-internet.herokuapp.com/context_menu