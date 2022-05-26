package com.selTurk2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C10FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver drv = new ChromeDriver();

        drv.get("https://www.amazon.com");
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        List<WebElement> linklistesi =drv.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayısı :"+linklistesi.size());
        drv.close();
    }
}
