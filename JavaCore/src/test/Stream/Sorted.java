package test.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
//        int [] array = {21,12,41,62,672,11};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        Student1 student1 = new Student1("Bob",'m', 30, 4, 5.6 );
        Student1 student2 = new Student1("Jack",'m', 25, 3, 9.6 );
        Student1 student3 = new Student1("Nick",'m', 19, 1, 7.6 );
        Student1 student4 = new Student1("Rob",'m', 22, 1, 3.1 );
        Student1 student5 = new Student1("Mike",'m', 26, 5, 6.4 );

        List<Student1> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students = students.stream().sorted((x,y)->
        x.getName().compareTo(y.getName())).collect(Collectors.toList());
    }
}
class Student1 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student1{" +
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