package com.marko.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("We get a book from schoolLibray");
    }
}
