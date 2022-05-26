package com.webLesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindow {

    WebDriver web;

    @Before
    public void web(){
        WebDriverManager.chromedriver().setup();
        web =new ChromeDriver();
        web.manage().window().maximize();

    }
    @Test
    public void test() throws InterruptedException {
        web.get("https://demoqa.com/browser-windows");
        WebElement tabButton = web.findElement(By.id("tabButton"));
        tabButton.click();
            //getWindowHandles komutu penceler arasında dolaşmak içindir.
        List<String> tabs = new ArrayList<>(web.getWindowHandles());//Bütün pencelerler list'e alınnır
        System.out.println(tabs.size());
        web.switchTo().window(tabs.get(1)); //switcTo ile 2.ci taba geçildi ,index sıfirdan başladığı için
        System.out.println(web.getCurrentUrl());


        Thread.sleep(5000);


    }
    @After
    public void cl(){
     //   web.close();
    }
}
