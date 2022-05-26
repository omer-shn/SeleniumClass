package com.webLesson;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

    WebDriver web;

    @Test
    public void test() {
        // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        web = new ChromeDriver();
        web.get("https://demoqa.com/nestedframes");

        web.switchTo().frame(1);
        WebElement parentFrame = web.findElement(By.tagName("body"));
        System.out.println(parentFrame.getText());

        web.switchTo().frame(0);
        WebElement p = web.findElement(By.tagName("p"));
        System.out.println(p.getText());

        web.switchTo().parentFrame(); //bir üst frame'e (çerçeveye) çıkmak için
    }

}
