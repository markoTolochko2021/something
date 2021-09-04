package test.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Student st1 = new Student("Mark", "Tolochko", 4);
        Student st2 = new Student("Nick", "Koko", 1);
        Student st3 = new Student("Jack", "Bobo", 3);
        Student st4 = new Student("Mike", "Nono", 2);

        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 7.5);
        map.put(st2, 8.6);
        map.put(st3, 5.1);
        map.put(st4, 6.9);
        System.out.println(map);
        Student st5 = new Student("Mark", "Tolochko", 4);
//        boolean res = map.containsKey(st5);
//        System.out.println(res);
        System.out.println(st1.hashCode());
        System.out.println(st5.hashCode());

        for (Map.Entry<Student,Double> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }
}

class Student /*implements Comparable<Student>*/{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

   /* @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }*/
}
