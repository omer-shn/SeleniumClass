package com.myseleniumpro02;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.myseleniumpro02.utilities.TestBase1.selectCheckBox;

public class Day08CheckboxUtil extends TestBase {
    @Test
    public void checkBoxTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

       WebElement checkbox1 =driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 =driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        selectCheckBox(checkbox1,true);
        Thread.sleep(2000);
        selectCheckBox(checkbox2,true);
    }
}
