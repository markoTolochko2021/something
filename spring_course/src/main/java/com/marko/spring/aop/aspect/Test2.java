package com.marko.spring.aop.aspect;

import com.marko.spring.aop.MyConfig;
import com.marko.spring.aop.Student;
import com.marko.spring.aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }
        catch (Exception e){
            System.out.println("we got a exception " + e);
        }

        context.close();
    }
}
