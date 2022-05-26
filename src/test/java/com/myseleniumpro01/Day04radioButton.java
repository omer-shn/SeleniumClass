package com.myseleniumpro01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04radioButton {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void radio() throws InterruptedException {
        driver.findElement(By.linkText("Yeni Hesap Oluştur")).click();
        driver.findElement(By.name("firstname")).sendKeys("test f name");
        driver.findElement(By.name("lastname")).sendKeys("test l name");
        driver.findElement(By.name("reg_email__")).sendKeys("01234567");
        driver.findElement(By.name("reg_passwd__")).sendKeys("secretPass!");
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
      //  driver.findElement(By.xpath("(//input[@type='submit'])[7]")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(4000);

        WebElement monthDropdown =driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("Jan");

        WebElement dayDropdown =driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByVisibleText("5");

        WebElement yearDropdown =driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear = new Select(yearDropdown);
        selectDay.selectByVisibleText("2023");

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
