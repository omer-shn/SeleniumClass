package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01GeneralStep {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        System.out.println("Title "+driver.getTitle());
        System.out.println("URL " +driver.getCurrentUrl());
        driver.close();
    }
}
