package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C27DropDowm {


    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    //dropDown kullanımı 3 adımlıdır 1 -menüye git
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com");
       WebElement dropDownMenu =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
      // 2.adım seçilir
        Select select =new Select(dropDownMenu);
      // 3. adımda 3 yöntem vardır. Birtanesiyle uygulama yapalım.
        select.selectByVisibleText("Books");
      //  select.selectByIndex();
      //  select.selectByValue();

     //arama kutusuna Java yazdıralım
      WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
      aramaKutusu.sendKeys("Java"+ Keys.ENTER);

        //Java aratmasında çıkan sonuç yazısı
      Thread.sleep(4000);
      WebElement sonucyazisi =driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
      String sonucabak =sonucyazisi.getText();
      String arananKelime ="Java";

        Assert.assertTrue(sonucabak.contains(arananKelime));

        //Consolda görmek istiyorsak
        System.out.println(sonucabak);

    }

    @AfterClass
    public static void tearDown(){
        //driver.close();

    }
}
