package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C23Assertions1 {
    WebDriver driver;
    @Before
    public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
 @Test
    public void test01() {
     driver.get("https://www.amazon.com");

     // Testi aşağıdaki gibi if ile yaprsak url farklı bile olsa test sol altta başarılı görünür
     //Bu nedenle Junit ile beraber farklı bir yol uygulanacaktır.
     /*
     if (driver.getCurrentUrl().equals("https://www.facebook.com")) {
         System.out.println("it passed");
     } else {
         System.out.println("failed");
     }  */

     // Aşağıdaki yöntem if koşulu yerine kullanılır ve istenen neticeyi verir
     String expectedUrl ="https://www.facebook.com";
     String actualUrl = driver.getCurrentUrl();
     Assert.assertEquals("Url doesn't match (Url eşleşmiyor)",expectedUrl,actualUrl); // buradaki not sadece failed neticelerde çıkar


 }
 @After
    public void tearDown (){
        driver.close();
 }
}
