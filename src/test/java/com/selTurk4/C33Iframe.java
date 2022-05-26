package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C33Iframe {
 WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Test
    public void test01(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/iframe");
        WebElement header = driver.findElement(By.xpath("//h3"));
        // Bu ifadenin erişilebilirliğini test et
        Assert.assertTrue(header.isEnabled());
        System.out.println(header.getText());


        WebElement iframeElement =driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElement);

    //  WebElement textkutusu =driver.findElement(By.xpath("//body[@id='tinymce']"));

      WebElement textkutusu =driver.findElement(By.xpath("//p"));
      textkutusu.clear();
        textkutusu.sendKeys("Hello World");

        //Yukarıdaki satırda Locate ile ifare'e ulaşılamadı bunun sebebi bir üst (parent) iframe bulunmasıdır
        //Önce o locate edilmelidir.Bu nedenle aşağıdaki satırlar yukarı kopyalanmıştır
      //  WebElement iframeElement =driver.findElement(By.id("mce_0_ifr"));
      //  driver.switchTo().frame(iframeElement);

       // linki locate ediniz
        //Tabii önce bir üst yada garanti olsun diye en üst alana çıkış switchTo().defaultContent()
        //eğersadece bir üst çerçeveye çıkmak istenseydi switchTo().parentFrame denirdi.
        driver.switchTo().defaultContent();
       WebElement linkElement = driver.findElement(By.linkText("Elemental Selenium"));
       Assert.assertTrue(linkElement.isDisplayed());
        System.out.println(linkElement.getText());

    }
}
