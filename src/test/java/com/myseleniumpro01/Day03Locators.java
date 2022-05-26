package com.myseleniumpro01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03Locators {

    @Test
    public void locators() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //email
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        //pasword
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        //clicK on Sign button
        Thread.sleep(3000);
        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();


    }
}
