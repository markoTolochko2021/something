package test.oop.inheritance;

public class Test {

    void upSalary(Employee1 emp){
        emp.salary = emp.salary + 100;
    }

    public static void main(String[] args) {
       Doctor doctor = new Doctor();
       doctor.name = "Karl";
       doctor.age = 50;
       doctor.experience = 25;
       doctor.specialization = "surgeon";
       doctor.eat();
       doctor.sleep();
       doctor.treat();
    }

}
class Employee{
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

class Doctor extends Employee1 {
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

class Teacher extends Employee1 {
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

class Driver extends Employee1 {
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
class Surgeon extends Doctor{
    String scalpel;
    void surgery(){}
}
class Dentist extends Doctor{

}