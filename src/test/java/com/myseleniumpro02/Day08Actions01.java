package com.myseleniumpro02;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Day08Actions01 extends TestBase {

    @Test
    public void contexClickTest (){
        driver.get("https://the-internet.herokuapp.com/context_menu");
       WebElement box =driver.findElement(By.xpath("//div[@id='hot-spot']"));
        //box.click(); normal click no need actions class
       //create action object
        Actions action = new Actions(driver);
        //perform the action
        action.contextClick(box).perform();
        //Then verify te alert message is  "You selected a context menu"
        String alertText = driver.switchTo().alert().getText();
       Assert.assertEquals("FAILED","You selected a context menu",alertText); //FAILED notu sadece hata durumlarında görünür
        driver.switchTo().alert().accept();


    }
}
