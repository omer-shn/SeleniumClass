package com.webLesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    WebDriver web;

    @Before
    public void web(){
        WebDriverManager.chromedriver().setup();
        web =new ChromeDriver();
        web.manage().window().maximize();

    }
    @Test
    public void test() throws InterruptedException {
        web.get("http://demoqa.com/upload-download");
        WebElement upload = web.findElement(By.xpath("//input[@id='uploadFile']"));
        upload.sendKeys("C:/Users/pc/Desktop/JavaProje.txt");
        Thread.sleep(5000);


    }
    @After
    public void cl(){
        web.close();
    }
}
