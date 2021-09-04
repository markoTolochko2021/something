package com.marko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("main Start");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibraryBean", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println(bookName + " back to library");


        System.out.println("main ends");
        context.close();
    }
}
