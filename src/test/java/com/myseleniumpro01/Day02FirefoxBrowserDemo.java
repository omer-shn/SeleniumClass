package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02FirefoxBrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
