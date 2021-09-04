package test.oop.polimorphism;

public class Test {
    public static void main(String[] args) {

        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();

        Employee[] array2 = {emp1,emp2,emp3};

//        for (Employee employee: array2){
//            employee.work();
//        }
        System.out.println(emp1 instanceof Employee);
        System.out.println();

    }
}

abstract class Employee{
    void sleep(){
        System.out.println("Employee sleep");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able{

    @Override
    void work() {
        System.out.println("Teacher work");
    }

    @Override
    public void help() {
        System.out.println("Teacher help");
    }
}
class Driver extends Employee implements Help_able{

    @Override
    void work() {
        System.out.println("Driver work");
    }

    @Override
    public void help() {
        System.out.println("Driver help");
    }
}class Doctor extends Employee implements Help_able{

    @Override
    void work() {
        System.out.println("Doctor work");
    }

    @Override
    public void help() {
        System.out.println("Doctor help");
    }
}
interface Help_able{
    void help();
}