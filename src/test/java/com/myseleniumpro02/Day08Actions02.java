package com.myseleniumpro02;

import com.myseleniumpro02.utilities.TestBase;
import junit.framework.TestCase;
import org.junit.Test;
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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Day08Actions02 extends TestBase {


@Test
    public void hoverOver(){
    //        Given user is on the https://www.amazon.com/
    driver.get("https://www.amazon.com/");
//        When use click on “Account” link
    /*We must move the mouse over to the Account&List
     * so Account link can be visible
     * Account link is currently hidden*/
    WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
    Actions actions = new Actions(driver);
    actions.moveToElement(accountList).perform();
//        Clicking on the Account link
    driver.findElement(By.linkText("Account")).click();
//        Then verify the page title contains “Your Account”
    Assert.assertTrue(driver.getTitle().contains("Your Account"));
}

}


