package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05Navigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.manage().window().maximize();

        drv.navigate().to("https://www.facebook.com");
        drv.navigate().to("https://www.amazon.com");
        drv.navigate().back();
        Thread.sleep(2000);
        drv.navigate().forward();
        Thread.sleep(2000);
        drv.navigate().refresh();
        Thread.sleep(2000);
        drv.close();

        //drv.quit birden fazla açık sekme varsa (o test sırasında) hepsini kapatır.

        //Birden fazla sayfada test olacaksa driver.get yerine navigate().to() kullanılır
        // Thread.sleep(2000) milsaniye geçişleri farketmek içindir

    }
}
