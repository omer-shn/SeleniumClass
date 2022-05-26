package com.selTurk05;

import com.github.javafaker.Faker;
import com.selTurk1.utilities.TestBaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C39Faker extends TestBaseClass {
    @Test
    public void test1() {
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement nameBox = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));

        Actions actions = new Actions(driver);
        Faker faker = new Faker();
        String sameEmail ="enesusgazi@gmail.com";
        actions.click(nameBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("sameEmail")
                .sendKeys(Keys.TAB)
                .sendKeys("sameEmail")
                .sendKeys(faker.internet().password())
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
