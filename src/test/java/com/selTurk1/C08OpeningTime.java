package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08OpeningTime {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Bir web sayfası açılırken, içerisindeki elemente göre bir yüklenme süresine ihtiyaç vardır.
        //bu tür durumlar için max beklme süresi timeouts().implicitlyWait(Duration.ofSeconds()) yoluyla eklenir.
        //Amaç açılana kadar max bekleme süresi belirlemektir.
    }
}
