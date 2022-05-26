package com.selTurk2.selTurk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class C36WindowHandles {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
        //driver.quit();
    }
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/windows");
      WebElement pageHeading = driver.findElement(By.xpath("//h3"));
      String expectedWord = "Opening a new window";
      String actualWord =pageHeading.getText();
      Assert.assertEquals(expectedWord,actualWord);

      //Title =The internet
        String expectedTitle= "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        String firstPageHandle = driver.getWindowHandle();

        //print the "click here"
        driver.findElement(By.linkText("Click Here")).click();

        //assert the Title ="New Window"

        String expectedSecondTitle = "New Window";
        String actualSecondTitle = driver.getTitle();
        Assert.assertEquals(expectedSecondTitle,actualSecondTitle);

        Set<String> windowHandleSet = driver.getWindowHandles();
        System.out.println(windowHandleSet);

        String secondWindowHansle="";

        for ( String each : windowHandleSet) {
            if (!each.equals(firstPageHandle)) {
                secondWindowHansle =each;
            }
        }
        driver.switchTo().window(secondWindowHansle);

        //Finally back to first page again.
        driver.switchTo().window(firstPageHandle);


    }
}
