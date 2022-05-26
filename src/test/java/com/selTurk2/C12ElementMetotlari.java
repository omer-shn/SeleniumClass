package com.selTurk2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C12ElementMetotlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver dr =new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        dr.get("https://www.amazon.com");
        WebElement aramakutusu = dr.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName ="input";
        String actualTagName =aramakutusu.getTagName();
        if(expectedTagName.equals(actualTagName)) {  //sitedeki tag name ile komuttaki ile aynımıdır.
            System.out.println("Tagname passed");
        }else {
            System.out.println("Tagname failed");
        }

            String expectedNamedegeri = "field-keywords";// arama kutusu attributer değerinin "field keywords" olduğunu test edin
            String actualNamedegeri =aramakutusu.getAttribute("name");
            if (expectedNamedegeri.equals(actualNamedegeri)) {
                System.out.println("name attribute test passed");
            } else {
                System.out.println("failed");

            }
            dr.close();
            }
}
