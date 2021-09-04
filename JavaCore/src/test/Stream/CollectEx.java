package test.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        Student student1 = new Student("Bob",'m', 30, 4, 5.6 );
        Student student2 = new Student("Jack",'m', 25, 3, 9.6 );
        Student student3 = new Student("Nick",'m', 19, 1, 7.6 );
        Student student4 = new Student("Rob",'m', 22, 1, 3.1 );
        Student student5 = new Student("Mike",'m', 26, 5, 6.4 );

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Map<Integer, List<Student>> map = students.stream().map(e -> { e.setName(e.getName().toUpperCase());
        return e;}).collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
