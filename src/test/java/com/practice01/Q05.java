package com.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q05 {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test(){

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(driver,100);
        deleteButtonsAndValidate(driver,20);
    }

    public void createButtons(WebDriver driver, int number) {
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for(int i= 1; i<=number; i++){
            addButton.click();
        }
    }

    public void deleteButtonsAndValidate(WebDriver driver, int numofDelete) {
       List< WebElement> elementBefore = (List<WebElement>) driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
       int sizebeforeDelete =elementBefore.size();

       int counter = 0;
       for(WebElement w:elementBefore) {
           counter++;
           if(counter> numofDelete) {
               break;
           }
           w.click();
       }
       List<WebElement>elementafter = (List<WebElement>) driver.findElement(By.xpath("//button[@onclick='addElement()']"));
       int sizeAfterDelete =elementafter.size();

        Assert.assertEquals(sizeAfterDelete-numofDelete,sizeAfterDelete);


    }
    @After
    public void tearDown(){
        // driver.close();
    }
}
