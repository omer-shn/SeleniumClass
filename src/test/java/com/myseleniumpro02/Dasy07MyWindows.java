package com.myseleniumpro02;

import com.myseleniumpro02.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Dasy07MyWindows extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        String googleWindowHandle =driver.getWindowHandle();
        System.out.println("Google Title "+driver.getTitle());


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Title "+driver.getTitle());


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowhandle = driver.getWindowHandle();
        System.out.println("Linkedin Title "+driver.getTitle());

        driver.switchTo().window(amazonWindowHandle);
        System.out.println("Amazon Title "+driver.getTitle());
        driver.switchTo().window(googleWindowHandle);
        System.out.println("Google Title "+driver.getTitle());
        driver.switchTo().window(linkedinWindowhandle);
        System.out.println("Linkedin Title "+driver.getTitle());


    }

}
