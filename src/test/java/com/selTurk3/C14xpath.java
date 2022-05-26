package com.selTurk3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C14xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver dr =new ChromeDriver();
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Aşağıdaki siteye git ve çıkan Add Element butonuna bas
        dr.get("https://the-internet.herokuapp.com/add_remove_elements/");
        dr.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //  dr.findElement(By.xpath("//button[text()='Add Element']")).click(); //sadece text olduğu için bu yolla da locate edilebilir
        //  dr.findElement(By.xpath("//*[text()='Add Element']")).click(); // yine sadece text olduğu için bu yolla da locate edilebilir
        Thread.sleep(2000);

        //sonra görünen Delete tuşuna bas
        dr.findElement(By.xpath("//button[@class='added-manually']")).click();


        //Add/Remove yazısı göründü mü test et?
        WebElement addRemove = dr.findElement(By.xpath("//h3"));
        if (addRemove.isDisplayed()) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        dr.close();


    }
}
