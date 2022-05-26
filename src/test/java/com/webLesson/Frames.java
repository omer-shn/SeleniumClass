package com.webLesson;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    WebDriver web;

    @Test
    public void test() {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        web = new ChromeDriver();
        web.get("https://demoqa.com/frames");

      //  web.switchTo().frame(1); //Bu frame'in iç elementine ulaşmak içindir
        web.switchTo().frame("frame1"); // bu satırda da aynı işlemi yapar

       WebElement frame = web.findElement(By.id("sampleHeading"));
       String text = frame.getText(); // text değişkeniyle web adresinde yazan frame içi text'i çağırıyoruz.
        System.out.println(text);// ve burada da consol'a getiriyoruz.

        web.switchTo().parentFrame();
        web.switchTo().frame("frame1");

        WebElement frame2 =web.findElement(By.id("sampleHeading"));
        String text2 = frame2.getText();
        System.out.println(text2);

    }
}
