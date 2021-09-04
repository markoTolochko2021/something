package test.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Bob",'m', 30, 4, 5.6 );
        Student student2 = new Student("Jack",'m', 25, 3, 9.6 );
        Student student3 = new Student("Nick",'m', 19, 1, 7.6 );
        Student student4 = new Student("Rob",'m', 22, 1, 3.1 );
        Student student5 = new Student("Mike",'m', 26, 5, 6.4 );

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        for (Student s: studentArrayList){
            System.out.println(s);
        }
        System.out.println("*******************************");
        Student student6 = new Student("Nick",'m', 19, 1, 7.6 );
        studentArrayList.remove(student6);
        for (Student s: studentArrayList){
            System.out.println(s);
        }
        System.out.println("*******************************");

    }
}


class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }
}