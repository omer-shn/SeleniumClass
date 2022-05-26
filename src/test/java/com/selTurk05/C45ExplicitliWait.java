package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C45ExplicitliWait extends TestBaseClass {
    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebElement itsGone = driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        Assert.assertTrue(itsGone.isDisplayed());

        driver.findElement(By.xpath("//button[text()='Add']")).click();
        WebElement itsBack = driver.findElement(By.xpath("//p[text()=\"It's back!\"]"));
        Assert.assertTrue(itsBack.isDisplayed());

    }

    // This time implicitly
    @Test
    public void test02() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement itsGone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's gone!\"]")));
        Assert.assertTrue(itsGone.isDisplayed());
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        WebElement itsBack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's back!\"]")));
        Assert.assertTrue(itsBack.isDisplayed());

    }
}