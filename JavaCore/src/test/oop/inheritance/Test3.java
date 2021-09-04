package test.oop.inheritance;

public class Test3 {
    Doctor d = new Doctor();
    Teacher t = new Teacher();
    Driver dr = new Driver();
    Employee e = new Employee();

    Employee1 employee1 = new Doctor1();
    Employee1 employee2 = new Teacher1();
    Employee1 employee3 = new Driver1();

}

class Employee1 {
    int salary = 100;
    String name;
    int age;
    int experience;
    String specialization;
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
}

class Doctor1 extends Employee1 {
    String specialization;
    @Override
    void eat() {
        super.eat();
    }
    @Override
    void sleep() {
        super.sleep();
    }
    void treat(){
        System.out.println("treat");
    }
}

class Teacher1 extends Employee1 {
    int students;
    @Override
    void eat() {
        super.eat();
    }
    @Override
    void sleep() {
        super.sleep();
    }
    void teach(){
        System.out.println("teach");
    }
}

class Driver1 extends Employee1 {
    String carBrand;
    @Override
    void eat() {
        super.eat();
    }
    @Override
    void sleep() {
        super.sleep();
    }
    void drive(){
        System.out.println("drive");
    }

}