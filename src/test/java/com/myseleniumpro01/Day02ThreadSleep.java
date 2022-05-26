package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driv =new ChromeDriver();

        driv.get("https://www.google.com");
        Thread.sleep(4000);
        driv.get("https://www.amazon.com");
        Thread.sleep(10000);
        driv.quit();

    }
}
