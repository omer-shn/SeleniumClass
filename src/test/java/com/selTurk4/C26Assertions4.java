package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C26Assertions4 {
    static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
        //siteye git sign in tıkla
    @Test
    public void test01(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("mehmetgmail.com"+ Keys.ENTER);
        WebElement ikazYazisi =driver.findElement(By.xpath("//*[text()='Invalid email address.']"));
        Assert.assertTrue(ikazYazisi.isDisplayed());



    }


    @AfterClass
    public static void tearDown() {
      //  driver.close();

    }


}