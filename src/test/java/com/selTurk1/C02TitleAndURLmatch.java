package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02TitleAndURLmatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.manage().window().maximize();

        drv.get("https://amazon.com");

        String actualTitle = drv.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("Title test passed");
        } else{
                System.out.println("Title " + arananKelime + "test failed");
            }

            String actualUrl = drv.getCurrentUrl();
            String expectedUrl = "https://amazon.com";
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Url passed");
            } else {
                System.out.println("Url failed");
            }
            drv.close();
        }

    }