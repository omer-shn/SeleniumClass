package com.selTurk4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C32BasicAuthentication {

    static WebDriver driver;
    @BeforeClass
    public static void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
    //Genellikle websitemizi zenginleştirmek için güncel biligiler gereklidir. bunları kendiimizi sürekli
    //takip edemeyiz ve sitemize yüklemek için zaman bulamayız. Bunu sağlayan firmalar ve onların websiteleri bulunur.
    // işte bu hizmeti web üzerinden onların vereceği bir kodlama ile alırız. Bir tür giriş dizilimi.
        @Test
    public void test01(){

    }
    @After
    public void tearDown(){
        //  driver.quit();
    }
}
