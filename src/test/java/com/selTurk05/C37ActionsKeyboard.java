package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C37ActionsKeyboard extends TestBaseClass {

    @Test
    public void test01(){
        driver.get("https://amazon.com");
      WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
      //Herzamanki gibi 3 step vardır.
        try {
            Actions actions =new Actions(driver);

            actions.click(searchBox).
                    keyDown(Keys.SHIFT).
                    sendKeys("n").
                    keyUp(Keys.SHIFT).
                    sendKeys("u").
                    sendKeys("t").
                    sendKeys("e").
                    sendKeys("l").
                    sendKeys("l").
                    sendKeys("a").
                    sendKeys(Keys.ENTER).perform();





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
