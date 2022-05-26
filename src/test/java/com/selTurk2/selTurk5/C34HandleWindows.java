package com.selTurk2.selTurk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C34HandleWindows {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
        //driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.amazon.com");
        // sayfa için bir Hash code üretir ve bu sürekli değişen bir koddur
        String sayfaHandleDeğeri = driver.getWindowHandle();
        System.out.println(sayfaHandleDeğeri);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
        driver.switchTo().newWindow(WindowType.TAB);

        //tekrar Anasayfaya dönmek ve ürünü bulmak için
        driver.get("https://www.amazon.com");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);

     //   Fakat yukarıdski yol uzundur. Onlar yerine o anki URL aşağıdaki gibi kopyalanıp ko ut satırına yazılırsa aynı fonksiyonu görür
      // driver.get("https://www.amazon.com/s?k=Nutella&ref=nb_sb_noss");

        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();
        //Yeni tabda açılan ürünün başlığını print et. getText şarttır.
       WebElement ürünTitle= driver.findElement(By.xpath("//span[@id='productTitle']"));
        System.out.println(ürünTitle.getText());

        //ilk sayfaya geç ve url sini print et.
        driver.switchTo().window(sayfaHandleDeğeri); // burası daha önce String değişkeniyle oluşturulmuştu
        System.out.println(driver.getCurrentUrl());



    }
}
