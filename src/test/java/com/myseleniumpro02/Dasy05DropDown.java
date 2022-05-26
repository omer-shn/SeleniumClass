package com.myseleniumpro02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dasy05DropDown {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void selectByIndexTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown")); //dropDown is located
        Select select = new Select(dropdown); // This is needed for dropdown
        select.selectByIndex(1); //we choose index 1 with selectByİndex
        Thread.sleep(3003);
        select.selectByIndex(2); //after 3 seconds select index2
        Thread.sleep(3000);
        select.selectByIndex(1);//after 3 seconds select index1 again
    }

    //other Select Ways are :2.way selectByValue
    @Test
    public void selectByValueTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        Thread.sleep(3000);
        select.selectByValue("2");
    }

    //3. selectByVisible
    @Test
    public void selectByVisibleTexttest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        select.selectByVisibleText("Please select an option");

    }

    @Test
    public void printAllTest() {

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement eachOption : allOptions) {
            System.out.println(eachOption);
        }
    }
    @Test
        public void printFirstSelectedOptionTest(){
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);
            WebElement firstSelectedOption = select.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText());


        }



    }
