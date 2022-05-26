package com.myseleniumpro02;

import com.myseleniumpro02.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class Day06TestBaseDemo extends TestBase {

    public WebDriver driver;   // to see from other class we do it public
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
// setup >>>test1 >>> teardown
// setup >>>test2 >>> teardown
