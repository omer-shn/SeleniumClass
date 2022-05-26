package com.webLesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
    WebDriver web;

    @Before
    public void web() {
        WebDriverManager.chromedriver().setup();
        web = new ChromeDriver();
        web.manage().window().maximize();
    }
    // Bir sayfada herhangi bir butona bstıktan sonra bir ikaz çıkabilir.
    //Bu class bunu incelemek ve ikazı geçmek içindir.
    @Test
    public void test() throws InterruptedException {
        web.get("https://demoqa.com/alerts");
        web.findElement(By.id("alertButton)")).click();

        Thread.sleep(3000);
     //  WebDriverWait forWiat = new WebDriverWait(3); //Thread.sleep e alternatif


        //Burada da switchTo komutuyla alert seçilir ve Accept ile çıkan ikaz kabul edilmiş olur.
        //Accept yerine dismiss seçilseydi reddedmiş olurduk.
        web.switchTo().alert().accept();
        //Eğer alert yani ikaz yazısıı colnsolda görmek istiyorsak, aşağıdaski komut satırı yazılır
        System.out.println(web.switchTo().alert().getText());
    }
}
