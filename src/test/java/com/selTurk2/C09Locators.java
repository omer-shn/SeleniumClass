package com.selTurk2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //amazon sitesinde findElement yoluyla istenen getirilir
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // oluşturulan değişkenle istenen kelime veya ifade aranır ve Keys.ENTER ile bulunur
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //ikinci bir arama yapmak için navigate ile arama sayfasna dönüyoruz
        driver.navigate().to("https://www.amazon.com");
        WebElement aramaKutusu2 = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu2.sendKeys("Helmet" + Keys.ENTER);

        //istenirse direk bir ürünün linki navigate yöntemiyle bulunur.
      //  driver.navigate().to("https://www.amazon.com/INNAMOTO-Skateboard-Helmet-Multi-Sports-Skateboarding/dp/B08P1XBL6Y/ref=sr_1_15?crid=3T1MKXTLHAEV0&keywords=helmet&qid=1652439947&sprefix=helmet%2Caps%2C316&sr=8-15");

    }
}


