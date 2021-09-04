package com.marko.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet{



    @Override
    public void say() {
        System.out.println("Bow - wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

//    @PostConstruct
//    public void initMethod(){
//        System.out.println("Class Dog: init");
//
//    }
//    @PreDestroy
//    public void destroyMethod(){
//        System.out.println("Class Dog: destroy");
//
//    }


}
