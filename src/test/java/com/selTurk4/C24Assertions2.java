package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C24Assertions2 {

    //Görevler birbirinin devamıysa özellikle aynı sitede işlem sürecekse @Before yerine  @BeforeClass uygundur
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }

    //URL nin amazon kelimesi içerdiğini test edin
    @Test
    public void test01() {

        String aranaKelime ="amazon";
        String actualurl =driver.getCurrentUrl();
        Assert.assertTrue(actualurl.contains(aranaKelime));
    }
    // Title ın facebook kelimesi içermediğini test et ====>> assertFalse
    @Test
    public void test02() {
        String istenmeyenKelime ="facebook";
        String actualTtile =driver.getTitle();
        Assert.assertFalse(actualTtile.contains(istenmeyenKelime));
    }
    @Test
    public void test03(){
        WebElement logoElement = driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logoElement.isDisplayed());

    }

    @AfterClass
    public static void tearDown(){
        driver.close();

    }

}