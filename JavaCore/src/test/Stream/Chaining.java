package test.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Chaining {
    public static void main(String[] args) {
//        int[] array = { 22,68,29,11,94,25,1};
//        int result = Arrays.stream(array).filter(arrEll -> arrEll%2 == 1).map(e -> {if (e%3 == 0){
//        e = e%3;} return e; }).reduce((a,e) -> a + e).getAsInt();
//        System.out.println(result );

        Student2 student1 = new Student2("Bob",'m', 30, 4, 5.6 );
        Student2 student2 = new Student2("Jack",'m', 25, 3, 9.6 );
        Student2 student3 = new Student2("Nick",'m', 19, 1, 7.6 );
        Student2 student4 = new Student2("Rob",'m', 22, 1, 3.1 );
        Student2 student5 = new Student2("Mike",'m', 26, 5, 6.4 );

        List<Student2> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.stream().map(el -> {el.setName(el.getName().toUpperCase());
            return el;
        })
                .filter(student -> student.getCourse() >= 3 )
                .sorted((x,y) -> x.getAge() - y.getAge() )
                .forEach(System.out::println);


    }
}
class Student2 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
