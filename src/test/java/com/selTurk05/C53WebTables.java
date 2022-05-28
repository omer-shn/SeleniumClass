package com.selTurk05;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class C53WebTables extends TestBase {
    @Test
    public void WebTable() {
    girisYap();

        List<WebElement> sutunBaslik =driver.findElements(By.xpath("//thead//tr[1]//th[3]"));
        System.out.println("Sütun Sayısı :" + sutunBaslik.size());
        WebElement allBody = driver.findElement(By.xpath("//tbody"));
        System.out.println(allBody.getText());

    }
    public void girisYap(){
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.linkText("Log in")).click();
        Actions actions =new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();

        //satırları liste halinde yaz
        List<WebElement> satirlarListesi =driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("Satir sayisi"+ satirlarListesi.size());

        for (WebElement each :satirlarListesi) {
            System.out.println(each.getText());
        }

        List<WebElement> cellList =driver.findElements(By.xpath("//tbody//tr[4]//td"));
        for (WebElement each : cellList) {
            System.out.println(each.getText());
        }

        // PhoneNo  başlığındaki tüm elementleri (sütun) yaz

        List<WebElement> baslikListesi = driver.findElements(By.xpath("//thead//tr[1]//th"));
        int phoneSutunu=0;
        for (int i =0; i<baslikListesi.size();i++) {
            if(baslikListesi.get(i).getText().equals("PhoneNo")){
                phoneSutunu=i;

            }
        }
        List<WebElement> PhoneSutunList = driver.findElements(By.xpath("//tbody//td["+(phoneSutunu+1)+"]"));

        for(WebElement each : PhoneSutunList) {
            System.out.println(each.getText());
        }

    }

}
