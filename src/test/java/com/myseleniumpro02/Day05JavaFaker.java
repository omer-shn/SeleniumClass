package com.myseleniumpro02;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05JavaFaker {
    @Test
    public void fakerTest(){

        Faker faker = new Faker();
        String fname = faker.name().firstName();
        System.out.println(fname);

        String lName = faker.name().lastName();
        System.out.println(lName);

        String fullName = faker.name().fullName();
        System.out.println(fullName);

        String userName = faker.name().username();
        System.out.println(userName);

        String title = faker.name().title();
        System.out.println(title);

        String city = faker.address().city();
        System.out.println(city);

        String state = faker.address().state();
        System.out.println(state);

        String fullAddress = faker.address().fullAddress();
        System.out.println(fullAddress);

        String cellPhone = faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        String email = faker.internet().emailAddress();
        System.out.println(email);

        String randomZipCode = faker.number().digits(5);
        System.out.println(randomZipCode);


    }

}
