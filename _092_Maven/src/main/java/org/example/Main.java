package org.example;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello maven!");
        Faker faker = new Faker();
        String firstName = faker.funnyName().name();
        String  superhero = faker.superhero().name();
        System.out.println("The super hero is: "+superhero);

    }
}