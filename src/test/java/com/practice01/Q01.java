package com.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test() {
        driver.get("https://www.amazon.com");
        driver.get("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println("All ok.");
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
