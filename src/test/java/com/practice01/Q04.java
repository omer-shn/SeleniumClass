package com.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("7");
        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        String result = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        Assert.assertEquals("12",result);
    }

    @After
    public void tearDown(){
       // driver.close();
    }
}
