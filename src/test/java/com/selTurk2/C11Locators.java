package com.selTurk2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C11Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://example.com");
        WebElement moreInfo = driver.findElement(By.linkText("More information..."));
        moreInfo.click();

        driver.navigate().to("https://demoqa.com/automation-practice-form"); //demoqa adresine yönlendir
        WebElement email = driver.findElement(By.id("userEmail")); //mail adresine git
        email.sendKeys("gulhero@gmail.com"); //bu email adresini oraya yazdır sendKeys ile

        WebElement gender = driver.findElement(By.className("custom-control-label")); //Cinsiyetten Male seç click ile
        gender.click();

        WebElement address = driver.findElement(By.id("currentAddress")); //adres kısmına git ve
        address.sendKeys("We have to be where needed"); // bu yazıyı oraya yazdır

        WebElement uploadPicture =driver.findElement(By.className("form-control-file"));
        uploadPicture.click();

        List<WebElement> linktotal =driver.findElements(By.tagName("a")); //toplam link sayısı
        System.out.println("Sayfa link toplamı :"+linktotal.size());

        for(WebElement tumelement : linktotal) {  //tüm web elementleri (class, id, input vb) göstermek için.
            System.out.println(tumelement.getText());
        }

      /*  WebElement userNumber = driver.findElement(By.className(" mr-sm-2 form-control")); //doğum tarihi kısmına git
        System.out.println(userNumber.getText());
        String mobilenumber = "Mobile Number";
        if (mobilenumber.contains(userNumber.getText())) {
            System.out.println("passed");
        } else {
            System.out.println("failed");


       */
        }

    }

