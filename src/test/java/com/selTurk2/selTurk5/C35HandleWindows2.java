package com.selTurk2.selTurk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C35HandleWindows2 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    @Test
    public void test01(){

        driver.get("https:www.amazon.com");
        String firstPagerHandle =driver.getWindowHandle(); // sonra ilk sayfaya dönüşler çin ilk başta almak iyidir.

        //Url amazon içeriyor mu test et
        String amazonUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(amazonUrl));

        //Open new window and got ot bestbuy
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String secondPageHandle = driver.getWindowHandle(); // 2. sayfanın handle

        String  bestbuyTitle ="Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(bestbuyTitle));

        // back to first page
        driver.switchTo().window(firstPagerHandle);
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+ Keys.ENTER);

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
       String result = resultElement.getText();
       String wantedWord = "Java";
       Assert.assertTrue(result.contains(wantedWord));

       //go to second page
        driver.switchTo().window(secondPageHandle);
        //test logo isDisplayed
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
        Assert.assertTrue(logo.isDisplayed());







    }
}
