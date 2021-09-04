package test.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        Student2
                student1 = new Student2
                ("Bob", 22, 4);
        Student2
                student2 = new Student2
                ("Jack", 19, 2);
        Student2
                student3 = new Student2
                ("Nick", 32, 1);
        Student2
                student4 = new Student2
                ("Rob", 27, 3);
        Student2
                student5 = new Student2
                ("Tob", 21, 4);

        List<Student2> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Test2 test2 = new Test2();
        test2.filterStudent(studentList, (Student2 s) -> {return s.age > 25;});
        Predicate<Student2> p1 = student -> student.age > 22;
        Predicate<Student2> p2 = student -> student.course > 2;
        test2.filterStudent(studentList, p1.and(p2));
        test2.filterStudent(studentList, p1.or(p2));


    }
    public void filterStudent(List<Student2> student2List, Predicate<Student2> predicate){
        for (Student2 s: student2List){
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }
}
class Student2{
    String name;
    int age;
    int course;

    public Student2(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
