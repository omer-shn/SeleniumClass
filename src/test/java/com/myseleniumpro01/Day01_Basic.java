package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //for Maximize
        driver.manage().window().maximize();

        driver.get("http://www.google.com/");

    }
}
