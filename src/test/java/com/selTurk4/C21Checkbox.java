package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C21Checkbox {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //Yukarıdaki siteye git ve seçili değilse checkbox için click işlemi yap
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox']) [1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox']) [2]"));

        if(!checkbox1.isSelected()) {
            checkbox1.click();
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

    }

    @After
    public void tearDown(){
       // driver.close();
    }
}
