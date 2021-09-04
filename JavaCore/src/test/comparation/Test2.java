package test.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Jack","Daniels", 5000);
        Employee emp2 = new Employee(300,"Nick","Petrusha", 2000);
        Employee emp3 = new Employee(200,"Bob","Dozik", 1000);
        Employee emp4 = new Employee(500,"Rob","Kanada", 3000);
        Employee emp5 = new Employee(400,"Pet","Gora", 4000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("Before: " + list);
        Collections.sort(list, new nameComparator());
        System.out.println("After: " + list);



    }
}
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id){
            return 0;
        }
        else if (this.id < o.id){
            return -1;
        }
        else {
            return 1;
        }
    }
}
//    class idComparator implements Comparator<Employee>{
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        if (o1.id == o2.id){
//            return 0;
//        }
//        else if (o1.id < o2.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }
//}
class nameComparator implements  Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
