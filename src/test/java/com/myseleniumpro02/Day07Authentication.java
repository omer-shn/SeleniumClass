package com.myseleniumpro02;
//import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.myseleniumpro02.utilities.TestBase;

public class Day07Authentication extends TestBase {
    @Test
    public void basicAuthentication(){
//        driver.get("https://USERNAME:PASSWORD@URL");
//        below will type admin for username and password on the link the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//        Verify teh congratulations message
        String message = driver.findElement(By.xpath("//p")).getText();

//        Assertion
        Assert.assertTrue(message.contains("Congratulations"));
    }
}
