package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02VeryURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.google.com");


        String actualURL = dr.getCurrentUrl();
        String expectedURL = "www.google.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
            System.out.println("expected URL  " + expectedURL);
            System.out.println("actual URl  " + actualURL);
        }
    }
}
