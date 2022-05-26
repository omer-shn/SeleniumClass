package com.selTurk05;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C41FileExist {
    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        String filepath = System.getProperty("user.home");

       String desktopTxt = filepath+"/Desktop/met.txt";
      //  String desktopTxt = filepath+"//Desktop//met.txt"; Bu satırda aynı neticeyi verir
        System.out.println(desktopTxt);

        System.out.println(Files.exists(Paths.get(desktopTxt)));
        Assert.assertTrue(Files.exists(Paths.get(desktopTxt)));

    }
}
