package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C36Actions extends TestBaseClass {

    @Test
    public void test01(){
        driver.get("https://demoqa.com/droppable");
        // dragAndDrop işlemin 2 elent gereklidir. Taşınacak elemnt ve onun içine bırrakılacağı kazan
       WebElement kazanElement = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
       WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(dragElement,kazanElement).perform();

        WebElement resultWordElement = driver.findElement(By.xpath("//*[text()='Dropped!']"));
        String expectedWord ="Dropped!";
        String actualWord=resultWordElement.getText();
        Assert.assertEquals(expectedWord,actualWord);





    }

}
