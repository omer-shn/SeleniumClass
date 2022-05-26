package com.myseleniumpro02.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {

    protected static WebDriver driver;
        @Before
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

//        @After public void tearDown(){
  //          driver.quit();
    //    }
    public static void selectCheckBox(WebElement chechboxElement, boolean checked){

            if( checked) {
                if(!chechboxElement.isSelected()) {
                    chechboxElement.click();
                }else if(chechboxElement.isSelected()) {
                    chechboxElement.click();
                }
            }
    }
    public static void switchToTargetWindow(String targetTitle) {
        for (String handle : driver.getWindowHandles()) {
            String title = driver.switchTo().window(handle).getTitle();
            if (title.equals(targetTitle)) {
                System.out.println("Page found : "+driver.getTitle());
                return;
            }
        }
    }


    }


