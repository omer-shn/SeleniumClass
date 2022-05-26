package com.myseleniumpro01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Day04implicitWait {

    @Test
    public void implicitWait () {
        WebDriverManager.chromedriver().setup();
        WebDriver driv = new ChromeDriver();

        //implicit wait for 30 seconds
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driv.get("https://www.google.com");
        driv.findElement(By.className("q"));
    }
    @Test
    public void threadSleep() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driv = new ChromeDriver();

        driv.get("https://www.google.com");
        Thread.sleep(30000);//Hard wait. Waits for 30 seconds for no reason



    }
}
