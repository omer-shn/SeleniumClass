package com.myseleniumpro03;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Day12JSExecutor  extends TestBase {
    @Test
    public void jsExecutorTest() {

        driver.get("https://www.carettahotel.com");
        WebElement Rooms = driver.findElement(By.xpath("//*[text()='Rooms']"));

        //Now creating is executor object
        JavascriptExecutor js =(JavascriptExecutor)  driver;
        js.executeScript("arguments[0].scrollIntoView(true)",Rooms);

        WebElement email = driver.findElement(By.xpath("//*[text()='info@carettahotel.com']"));
        js.executeScript("arguments[0].scrollIntoView(true)",email);

            //Alternative Locate
       // js.executeScript("arguments[0].scrollIntoView(true):"driver.findElement(By.xpath("//*[text()='info@carettahotel.com']")));

    }
}
//*[.='Our Rooms']