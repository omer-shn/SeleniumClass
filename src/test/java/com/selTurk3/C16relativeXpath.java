package com.selTurk3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C16relativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement bostonW =driver.findElement(By.id("pid6_thumb"));  //boston
        WebElement sailorW= driver.findElement(By.id("pid11_thumb")); //sailor

        //diğer bir ögeyi yeni yöntemle relative sağında,solunda,alt veya üstünde komutlarıyla locate ediyoruz
        // bunun için By yerine RelativeLocator.with komutu kullanılır.
        WebElement mountie =driver.findElement(RelativeLocator.with(By.tagName("img")).below(bostonW).toLeftOf(sailorW));
        System.out.println(mountie.getAttribute("id"));


    }

}
