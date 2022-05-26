package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C40Actions extends TestBaseClass {
    @Test
    public void test1() {
        driver.get("https://html.com/tags/iframe/");
        Actions actions =new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

      WebElement iframeYoutube= driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
      driver.switchTo().frame(iframeYoutube);
      driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
      driver.findElement(By.xpath("//button[@title='Tam ekran (f)']")).click();
        driver.findElement(By.xpath("//button[@title='Sessiz (m)']")).click();



    }
}
