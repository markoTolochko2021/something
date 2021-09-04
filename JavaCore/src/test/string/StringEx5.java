package test.string;

public class StringEx5 {
    public static void main(String[] args) {

        Employee employee = new Employee(100.5, true);
        System.out.println(employee.isManager + "" +employee.salary);


    }
}

class Employee{

    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}