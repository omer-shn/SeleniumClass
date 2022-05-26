package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C31Alert2 {
    static WebDriver driver;
    @BeforeClass
    public static void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin:admin@the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void acceptAlert(){
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept(); // önemli, uyarıdaki butona geçerek tuşa basar. Buradas Accept

        WebElement sonucYazisi = driver.findElement(By.xpath(" //p[@id='result']"));
        String expectedResult ="You successfully clicked an alert";
        String actualResult = sonucYazisi.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void dismissAlert(){
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));
        driver.switchTo().alert().dismiss(); // önemli, uyarıdaki butona geçerek tuşa basar. Buradas dismiss
        String Unexpectedistenmeyen = "successfuly";
        WebElement ResultYazisi =driver.findElement(By.xpath("//p[text()='You clicked: Cancel']"));
        String actualResult =ResultYazisi.getText();
        Assert.assertTrue(actualResult.contains(Unexpectedistenmeyen));
    }
    @Test
    public void promtAlert(){
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        driver.switchTo().alert().sendKeys("Yunus Emre");
        driver.switchTo().alert().accept(); //Burada bir fazla satır sendKeys den sonra kabul etmek için

        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//p[@id='result']"));
        String actualisim = sonucYazisiElementi.getText();
        String girilenisim = "Hasan";

        Assert.assertTrue(actualisim.contains(girilenisim));
    }

    @After
    public void tearDown(){
      //  driver.quit();
    }

}
