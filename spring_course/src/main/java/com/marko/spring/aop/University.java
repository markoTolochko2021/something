package com.marko.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Capitan Morgan", 2,6.7);
        Student st2 = new Student("Jim Bim", 3,7.5);
        Student st3 = new Student("Jack Daniels", 4,9.2);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents (){
        System.out.println("start method getStudent");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
