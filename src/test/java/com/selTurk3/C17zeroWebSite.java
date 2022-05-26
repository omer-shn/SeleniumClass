package com.selTurk3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C17zeroWebSite {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("500");
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();
       WebElement sonucYazisi =driver.findElement(By.xpath("//div[@id='alert_content']"));

       if(sonucYazisi.isDisplayed()) {
           System.out.println("passed");
       }else {
           System.out.println("failed");
       }
       driver.close();

        // tag [@attribute ismi= 'attribute değeri']
       // driver.close();
    }
}
