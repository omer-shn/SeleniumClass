package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C22RadioButton {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();
       // 2. way  driver.findElement(By.xpath("//*[text()='Yeni Hesap Oluştur']")).click();
        //çıkan ekrandan cinsiyet seçimini yapın
       WebElement female= driver.findElement(By.xpath("//input[@value='1']"));
        WebElement male= driver.findElement(By.xpath("//input[@value='2']"));
        WebElement ozel=  driver.findElement(By.xpath("//input[@value='-1']"));

        if (!male.isSelected()) {
            male.click();
        }



    }

    @After
    public void tearDown(){driver.close();
    }
}
