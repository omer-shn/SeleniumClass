package com.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();  //it gets on console
        String amazonUrl = driver.getCurrentUrl(); //it gets on console

        if (amazonTitle.contains("auto")) {
            System.out.println("Title contains auto");
        } else {
            System.out.println("it dosent contain auto");
        }

        if (amazonUrl.contains("auto")) {
            System.out.println("Url contains auto");
        } else {
            System.out.println("it dosent contain auto");
        }

    }
        @After
        public void tearDown () {
            driver.close();

        }
    }