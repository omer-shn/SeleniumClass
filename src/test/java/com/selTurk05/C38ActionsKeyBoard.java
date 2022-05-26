package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C38ActionsKeyBoard extends TestBaseClass {
    @Test
    public void test01(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement nameBox = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));

        Actions actions = new Actions(driver);
        actions.click(nameBox)
                .sendKeys("Enesus")
                .sendKeys(Keys.TAB)
                .sendKeys("Gazi")
                .sendKeys(Keys.TAB)
                .sendKeys("enesusgazi@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("enesusgazi@gmail.com")
                .sendKeys("opiumus7703")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("02")
                .sendKeys("Haz")
                .sendKeys("2008")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();



    }
}
