package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02PageResource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String pageSource = driver.getPageSource();

        if(pageSource.contains("Registry")) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();


    }

}
