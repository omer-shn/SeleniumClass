package com.selTurk3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C15cssCelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("http://a.testaddressbook.com/sign_in");  // bu adrese git
        // aşağıdaki elemntlere cssSelector yollarıyla ulaş
        WebElement mailtextBook = driver.findElement(By.cssSelector("#session_email"));
        WebElement password =driver.findElement(By.cssSelector("#session_password"));
        WebElement signInButon = driver.findElement(By.cssSelector("input[value='Sign in']"));

        // mail ve passwordü belirle
        mailtextBook.sendKeys("testtechproed@gmail.com");
        password.sendKeys("1234test!");
        signInButon.click();

        Thread.sleep(2000);
        driver.close();


    }

}
