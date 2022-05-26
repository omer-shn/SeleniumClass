package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C29DropDownHerOku {

    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test
    public void test01(){
    driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownmenu= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select =new Select(dropdownmenu);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("2"); //diğer option seçilir ve print edilir
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option 1"); //yine bir diğer option seçilere print edilir
        System.out.println(select.getFirstSelectedOption().getText());

        //Böylece aşağıdski üç yolla dropDown işlemi yapıldı
        //selectByIndex();
        //selectByValue();
        //selectByVisibleText();

       //şimdi tüm optionları print etmek için aşağıdaki yol kullanılır
        List<WebElement> tumOpsiyonlar =select.getOptions();
        for (WebElement each: tumOpsiyonlar) {
            System.out.println(each.getText());
        }

        //dropdown boyutunu bul ve 4 öğe varsa true yazdır değilse false
        int dropdownsize = tumOpsiyonlar.size();
        if(dropdownsize==4){
            System.out.println("True");
        }else {
            System.out.println("false");
        }




            

        

    }
}
