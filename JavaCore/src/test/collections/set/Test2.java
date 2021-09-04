package test.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Mark", 4);
        Student st2 = new Student("Nick", 1);
        Student st3 = new Student("Jack", 3);
        Student st4 = new Student("Mike", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st4));
        System.out.println(treeSet.tailSet(st4));
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
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
