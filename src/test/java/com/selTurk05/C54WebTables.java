package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class C54WebTables extends TestBaseClass {
    @Test
    public void webTablesDynqamic() {

        int satir = 4;
        int sutun = 4;
        girisYap();

        WebElement wantedCell = driver.findElement(By.xpath("//tbody//tr["+satir+"]//td["+sutun+"]"));
        System.out.println(wantedCell.getText());

    }

    public void girisYap() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.linkText("Log in")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();

        //satırları liste halinde yaz
        List<WebElement> satirlarListesi = driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("Satir sayisi" + satirlarListesi.size());

        for (WebElement each : satirlarListesi) {
            System.out.println(each.getText());
        }
    }
}
