package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C20BefroreClassAfterClass {

    // BeforeClass ve AftesClass sadece static methodlar için çalışır
   static WebDriver driver; // bu nedenle görüldüğü üzere driver değişkeni oluşturulan syntax ve BeforeClass ile AfterClass methodlarına static eklenir
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test02() {
        driver.get("https://www.techproeducation.com");
    }
    @Test
    public void test03(){
        driver.get("https://www.facebook.com");
    }


    @AfterClass
    public static void tearDown(){
        driver.close();
    }


}



