package test.finalStatic;

public class Static1 {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", 2);
        Student student2 = new Student("Jack", 2);
        Student student3 = new Student("Jack", 2);
        Student student4 = new Student("Jack", 2);
        Student student5 = new Student("Jack", 2);

        System.out.println(student1.name);
        System.out.println(Student.count);
        Student.showCount();
    }

}

class Student{
    String name;
    int course;
    static int count;
    int a;
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student # " + count + " added");
    }
    public static void showCount(){
        System.out.println("count: " + count);


    }
    public void showInfo(){
        System.out.println("Welcome");
        showCount();
        count++;

    }

}
