package test.oop.inheritance;

public class Human {
   protected String name = "Jack";
   protected static int salary = 1000;
   protected void work(){
        System.out.println("work");
    }
   protected static void rest(){
        System.out.println("rest");
    }

}
class Student extends Human{
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
