package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C34Actions extends TestBaseClass {
    @Test
    public void test01(){

        //step 1 Create a Actions
        Actions action = new Actions(driver);

        //Step 2Element locate
        driver.get("https://www.amazon.com");
        WebElement accountLink = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

        //Step3
        action.moveToElement(accountLink).perform();
       driver.findElement(By.xpath("//span[@class='nav-text']")).click();



    }
}
