package com.selTurk05;

import com.selTurk1.utilities.TestBaseClass;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C52Cookies extends TestBaseClass {

    @Test
    public void cookiesTesti() {
        driver.get("https://www.amazon.com");
        Set<Cookie> cookiesSet =driver.manage().getCookies();

        int count=1;
        for(Cookie each : cookiesSet) {
            System.out.println(count+ ".ci cookie: "+ each);
            System.out.println("name :"+ each.getName());
            System.out.println("value :"+each.getValue());
            count++;
        }

        int cookieSayisi =cookiesSet.size();
        Assert.assertTrue(cookieSayisi>5);

        for(Cookie each : cookiesSet) {
            if (each.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD",each.getValue());
            }
        }
        //Yeni Cookie oluşturma  ve ekleme
        Cookie cookie =new Cookie("en sevdiğim cookie","çikolatalı");
        driver.manage().addCookie(cookie);
        count=1;
        cookiesSet=driver.manage().getCookies();
        for (Cookie each :cookiesSet) {
            System.out.println(count+ ".ci cookie: "+ each);
            count++;
        }
        //Yeni cookie eklenmişmi test et
        Assert.assertTrue(cookiesSet.contains(cookie));

        //ismi skin olan cookie^'yi silin ve test edin
        Assert.assertFalse(cookiesSet.contains("skin"));

        //Tüm cookileri silin ve silindiğini test edin
        driver.manage().deleteAllCookies();
        cookiesSet= driver.manage().getCookies();
        Assert.assertTrue(cookiesSet.isEmpty());





    }
}
