package com.selTurk1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06setSizeandPosition {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("pencere ölçüsü "+driver.manage().window().getSize());
        System.out.println("pencere konumu "+driver.manage().window().getPosition());

        //ölçü ve konumu değiştirmek için

        driver.manage().window().setSize(new Dimension(780,320)); // setSize
        driver.manage().window().setPosition(new Point(5,5));//setPoint
    }
}
