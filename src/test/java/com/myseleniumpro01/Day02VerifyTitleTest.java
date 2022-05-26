package com.myseleniumpro01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String actualtitle = driver.getTitle();
        String expectedtitle = "Google";
        if (actualtitle.equals(expectedtitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
            System.out.println("expected title :" + expectedtitle);
            System.out.println("actual title :" + actualtitle);
        }
    }
}
