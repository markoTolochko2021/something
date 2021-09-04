package test.collections.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nick", 5);
        Student st3 = new Student("Jack", 1);
        Student st4 = new Student("Bob", 4);
        Student st5 = new Student("Rob", 2);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);

        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("Igor", 4);
        studentLinkedList.add(st6);
        studentLinkedList.add(1, st7);

        studentLinkedList.remove(3);
        for (Student s: studentLinkedList){
            System.out.println(s);
        }




    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
