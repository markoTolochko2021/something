package com.marko.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow meow");
    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
}
