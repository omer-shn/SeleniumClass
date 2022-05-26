package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03SayfaKaynagi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driv = new ChromeDriver();
        driv.manage().window().maximize();

// Task : amazon sitesine giderek Kaynak kodlarına "spend less" yazdığını test edin
        driv.get("https://www.amazon.com");

        String sayfaKaynakKod =driv.getPageSource(); //sayfa kaynağını verir
        String arananKelime ="Spend less";

        if(sayfaKaynakKod.contains(arananKelime)) {
            System.out.println("kaynak kod passed");
        } else {
            System.out.println(" there is no wanted word");
        }



    }
}
