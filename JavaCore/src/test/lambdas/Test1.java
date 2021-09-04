package test.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Bob", 22, 4);
        Student1 student2 = new Student1("Jack", 19, 2);
        Student1 student3 = new Student1("Nick", 32, 1);
        Student1 student4 = new Student1("Rob", 27, 3);
        Student1 student5 = new Student1("Tob", 21, 4);

        List<Student1> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Test1 test1 = new Test1();
//        Collections.sort(studentList, new Comparator<Student1>() {
//            @Override
//            public int compare(Student1 o1, Student1 o2) {
//                return o1.age - o2.age;
//            }
//        });
        Collections.sort(studentList, (st1, st2) -> st1.course - st2.course);
        System.out.println(studentList);

//        test1.filterStudent(studentList, (Student1 s1) -> {return s1.age > 22;} );


    }
    public void filterStudent(List<Student1> stl, CheckStudent checkStudent){
        for (Student1 s: stl){
            if (checkStudent.check(s)){
                System.out.println(s);
            }
        }
    }
}
class Student1{
    String name;
    int age;
    int course;

    public Student1(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
interface CheckStudent{
    boolean check(Student1 s);
}

