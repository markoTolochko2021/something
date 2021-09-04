package test.oop.inheritance;

public class Test2 {

}
class Human2 {
    String name;
    String surname;

    public Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human2() {

    }
}

class Student2 extends Human2{

    public Student2(String name, String surname) {
        super(name, surname);
    }

    public Student2() {
        super();
    }

    public static void main(String[] args) {
        Student2 student2 = new Student2();


    }
}