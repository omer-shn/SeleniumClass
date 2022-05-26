package com.selTurk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07FullScreenAndMax {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driv = new ChromeDriver();

        driv.manage().window().maximize();
        System.out.println("maximize konum "+driv.manage().window().getPosition());
        System.out.println("maximize boyut "+driv.manage().window().getSize());

        driv.manage().window().fullscreen();
        System.out.println("fullscreen konum "+driv.manage().window().getPosition());
        System.out.println("fullscreen boyut  "+driv.manage().window().getSize());
    }
}
