package com.myseleniumpro01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04partialLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.linkText("Addresses"));
        //if ling text too long
        // if there is before or after the text
       //2.way (with partialLinkText)   driver.findElement(By.partialLinkText("Addre"));
        //driver.findElement(By.partialLinkText("Addres")); //it gives same result
       //  driver.findElement(By.partialLinkText("dress")); //it gives same result


      //  Then verify that the expected user id testtechproed@gmail.com
      //       (USE getText() method to get the text from the page)
         WebElement idElement = driver.findElement(By.className("navbar-text"));
     //    System.out.println(idElement.getText());//testtechproed@gmail.com
        String idElementText=idElement.getText();
        Assert.assertEquals("testtechproed@gmail.com",idElementText);

        WebElement singOut = driver.findElement(By.partialLinkText("Sign out"));
                Assert.assertTrue(singOut.isDisplayed());

      /*
       List<WebElement> allLinks =driver.findElements(By.linkText("a"));
       int numberofLink = allLinks.size();
       System.out.println(numberofLink);

       */

       driver.findElement(By.linkText("Sign Out")).click();





    }
}
