package com.marko.spring.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("We get a book  from uniLibrary");
        System.out.println("****************************************");

    }

    public String returnBook(){
        int a = 10 / 0;
        System.out.println("We get back the book to UniLibrary");
        return "Spring aop";
    }
    public void returnMagazine(){
        System.out.println("We get back the magazine to UniLibrary");
        System.out.println("****************************************");

    }

    public void getMagazine(){
        System.out.println("We get a magazine from uniLibrary");
        System.out.println("****************************************");

    }

    public void addBook(String personName, Book book){
        System.out.println("We add the book  to uniLibrary");
        System.out.println("****************************************");

    }
    public void addMagazine(){
        System.out.println("We add the magazine  to uniLibrary");
        System.out.println("****************************************");

    }




}
