package com.myseleniumpro01;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Day03JunitClass {

    @Before
    public void setUp(){
        System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test01(){
        System.out.println("this is test 1");
    }
    //if we dont want to run a method we use @Ignore key.
    @Ignore
    @Test
    public void test02(){
        System.out.println("this is test 2");
    }
    @Test
    public void test03(){
        System.out.println("this is test 3");
    }
    @Test
    public void test04(){
        System.out.println("this is test 4");
    }
}
