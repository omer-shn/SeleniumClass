package com.selTurk3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C13amazonFirstProduct {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver dr =new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        dr.get("https://www.amazon.com");
        //Searck kutusuna city bike yazdırır ve otomatik Entere basar
        // WebElement daramakutusu = dr.findElement(By.id("twotabsearchtextbox"));
        // daramakutusu.sendKeys("city bike"+ Keys.ENTER);
        //2.yol obje oluşturmadan yapılır ve daha kısadır.
        dr.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);

        //Aramada kaç tane sonuç listelenir. Çok fazla sonuç çıktığı için List'e alabiliriz.
        //incele bölümünde 24 sonuç çıktı 1.si bizim aradığımız olduğu için index 0 olur.
        List<WebElement> istenenElemenList =dr.findElements(By.className("sg-col-inner"));
        WebElement sonucyazisiElementi =istenenElemenList.get(0);
        System.out.println(sonucyazisiElementi.getText());

        //Çıkan sonuçlarda ilk ürüne tıkla, yine incele kısmında sonuç çok fazla çıktı ve yine List kullanıyoruz
        List<WebElement>urunResimlerilist =dr.findElements(By.className("s-image"));
        WebElement ilkurun = urunResimlerilist.get(0);
        ilkurun.click();


    }
}
