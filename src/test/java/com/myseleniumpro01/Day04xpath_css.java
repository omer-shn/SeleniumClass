package com.myseleniumpro01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04xpath_css {
    WebDriver driver ;// Webdriver değişkenini en üsste tanımladık
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("http://a.testaddressbook.com/sign_in");

    }
    @Test
    public void xpath_css(){
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234!");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Test
    public void css(){
        driver.findElement(By.cssSelector("input[data-test='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[data-test='submit']")).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
