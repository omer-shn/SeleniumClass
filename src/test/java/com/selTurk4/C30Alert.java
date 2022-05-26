package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.time.Duration;

public class C30Alert {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test01(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        //çıkan uyarıya basmak için. Ok tuşuna bas
        driver.switchTo().alert().accept();

        //result kısmında çıkan yazıyı "You successfully clicked an alert" test et.
        WebElement resultElement = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedResult ="You successfully clicked an alert";
        String actualResult =resultElement.getText();
        Assert.assertEquals(expectedResult,actualResult);


    }
    @After
    public void tearDown(){
        //driver.close();

    }
}
