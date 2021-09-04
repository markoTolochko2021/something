package test.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {
    void testStudents(List<Student> al, StudentChecks sc){
        for (Student s: al){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 22,4);
        Student student2 = new Student("Jack", 19,2);
        Student student3 = new Student("Nick", 32,1);
        Student student4 = new Student("Rob", 27,3);
        Student student5 = new Student("Tob", 21,4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        Test test = new Test();

        double res = avgOfSmth(studentList,student -> Double.valueOf(student.age));
        System.out.println(res);

//        test.testStudents(studentList, new CheckOverAge());
//        test.testStudents(studentList, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age > 25;
//            }
//        });
//        test.testStudents(studentList, (Student s) -> {return s.age > 28;});
//        test.printStudentOverAge(studentList, 27);
//        test.printStudentOverCourse(studentList,2);
//        test.printStudentMixCondition(studentList,26,3);
    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> function){
        double result = 0;
        for (Student s: list){
            result+= function.apply(s);
        }
        result = result / list.size();
        return result;
    }
//    void printStudentOverAge(List<Student> al, int age){
//        for (Student s: al){
//            if (s.age > age){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentOverCourse(List<Student> al, int course){
//        for (Student s: al){
//            if (s.course < course){
//                System.out.println(s);
//            }
//        }
//
//    }void printStudentMixCondition(List<Student> al, int age, int course){
//        for (Student s: al){
//            if (s.age > age && s.course < course){
//                System.out.println(s);
//            }
//        }
//    }
}
class Student{
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}

interface StudentChecks{
    boolean check(Student s);
}

//class CheckOverAge implements StudentChecks{
//
//    @Override
//    public boolean check(Student s) {
//        return s.age > 22;
//    }
//}