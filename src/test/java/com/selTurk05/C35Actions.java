package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class C35Actions extends TestBaseClass {

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions actions = new Actions(driver);
        WebElement linedAreas = driver.findElement(By.id("hot-spot"));
        actions.contextClick(linedAreas).perform();

        String expectedWord = "You selected a context menu";
        String actualWord =driver.switchTo().alert().getText();
        Assert.assertEquals(expectedWord,actualWord);
            //Tamam de ve alert i kapat
        driver.switchTo().alert().accept();
            //Elemental Selenium linkine tıkla ,daha sonra gerekeceği için ilksayfanın Handle nı al
        String firstPageHanle =driver.getWindowHandle();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

        //Yeni bir sayfa açılacağı ve artık birden fazla pencere olacağı için Set ile handles et
        //Aynı zamanda 2. sayfanında Handle nı al
        Set<String> handleSet =driver.getWindowHandles();
        String secondPageHandle ="";
        System.out.println(handleSet);

        for(String each :handleSet) {
            if( !each.equals(firstPageHanle)) {
                secondPageHandle =each;
            }
            //açılan sayfada Elemental Selenium yazdığını test et
            driver.switchTo().window(secondPageHandle);
          //  WebElement elementStatement = driver.findElement(By.tagName("h1"));
            WebElement elementStatement = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
            String expectedWord2 = "Elemental Selenium";
            String actualWord2 = elementStatement.getText();
            Assert.assertEquals(expectedWord2,actualWord2);


        }

    }
}
