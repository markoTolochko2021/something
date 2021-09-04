package test.collections.queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class Test2 {
    public static void main(String[] args) {

        Student st1 = new Student("Mark", 4);
        Student st2 = new Student("Nick", 1);
        Student st3 = new Student("Jack", 3);
        Student st4 = new Student("Mike", 2);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);

        System.out.println(priorityQueue);


    }
}
class Student implements Comparable<Student>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
