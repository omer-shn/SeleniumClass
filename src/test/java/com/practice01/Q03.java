package com.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Q03 {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
      //  driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]"));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Can");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.05.2022");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
       // driver.findElement(By.xpath("//select[@id='selenium_commands']")).sendKeys("Browser Commands");
        driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]")).click();
        Thread.sleep(4000);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
