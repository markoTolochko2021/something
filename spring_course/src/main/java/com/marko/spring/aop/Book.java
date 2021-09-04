package com.marko.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {

    @Value("SPRiNG")
    private String name;

    @Value("Jack")
    private String author;

    @Value("2010")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
