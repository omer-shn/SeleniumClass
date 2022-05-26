package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C28DropDownOptions {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        WebElement dropdownmenu =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select =new Select(dropdownmenu);
        select.selectByVisibleText("Books");

        //Bir dropDown işleminde son seçilen optiona ulaşmak için select.getFirstSelectedOption() komutu kullanılır
        //buna getText ekleyerek print edilebilir.
        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> optionList = select.getOptions();
        int actualOptionSayisi = optionList.size();
        int expectedOptionSayisi= 28;
        Assert.assertEquals(expectedOptionSayisi,actualOptionSayisi);




    }

    @After
    public void tearDown(){
       // driver.close();
    }

}
