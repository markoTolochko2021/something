package test.Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {
        Student student1 = new Student("Bob",'m', 30, 4, 5.6 );
        Student student2 = new Student("Jack",'m', 25, 3, 9.6 );
        Student student3 = new Student("Nick",'m', 19, 1, 7.6 );
        Student student4 = new Student("Rob",'m', 22, 1, 3.1 );
        Student student5 = new Student("Mike",'m', 26, 5, 6.4 );

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Math");
        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);
        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(student -> System.out.println(student.getName()));

        };
}
class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty(Student st){
        studentsOnFaculty.add(st);
    }
}
