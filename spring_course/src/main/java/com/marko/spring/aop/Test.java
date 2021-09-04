package com.marko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("bookBean", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Bob", book);
        uniLibrary.addMagazine();

//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
