package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C25Assertions3 {
    static WebDriver driver;
  @BeforeClass
  public static void setUp(){
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://www.bestbuy.com/");
  }
  //sayfa URL si aşağıdakine eşit mi
  @Test
  public void test(){
      String expectedUrl="https://www.bestbuy.com/";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(expectedUrl,actualUrl);
  }
  //Rest kelimesinin sayfada bulunmadığını test edin.
  @Test
  public void test02(){
      String istenmeyenKelime = "Rest";
      String actualTitle = driver.getTitle();
      Assert.assertFalse(actualTitle.contains(istenmeyenKelime));
  }
  //Logo görünüyormu test et
  @Test
  public void test03(){
      WebElement logo =driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
      Assert.assertTrue(logo.isDisplayed());
  }
  //Français sekmesi görünüyormu
  @Test
  public void test04(){
      WebElement francais  =driver.findElement(By.xpath("//*[text()='Français']"));
      Assert.assertTrue(francais.isDisplayed());
  }

    @AfterClass
    public static void tearDown(){
     //   driver.close();

    }
}
