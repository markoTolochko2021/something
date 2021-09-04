package test.oop.interfaceEx;



public class Test {
    public static void main(String[] args) {
        Help_able help_able = new Teacher2();
        help_able.help();
    }

}
    class Employee2 {
        int salary = 100;
        String name;
        int age;
        int experience;

        void eat() {
            System.out.println("eat");
        }
        void sleep() {
            System.out.println("sleep");
        }
    }

    class Doctor2 extends Employee2 {
        String specialization;
        void treat() {
            System.out.println("treat");
        }
    }

    class Teacher2 extends Employee2 implements Help_able{
        int students;
        void teach() {
            System.out.println("teach");
        }

        @Override
        public void help() {

        }
    }

    class Driver2 extends Employee2 {
        String carBrand;
        void drive() {
            System.out.println("drive");
        }
    }
    interface Help_able{
    void help();
    }