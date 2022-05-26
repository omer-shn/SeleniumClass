package com.myseleniumpro01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Day03WebDriverManager {
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome","./drivers/chromedriver.exe");
      // we won't use this structure no more.

        WebDriverManager.chromedriver().setup(); // our new build
        WebDriver driver = new ChromeDriver();

        WebDriver driver1 = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
            System.out.println("expected title :" + expectedTitle);
            System.out.println("actual title :" + actualTitle);
        }


    }
}
