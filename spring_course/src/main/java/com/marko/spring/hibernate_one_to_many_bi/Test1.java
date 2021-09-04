package com.marko.spring.hibernate_one_to_many_bi;

import com.marko.spring.hibernate_one_to_many_bi.entity.Department;
import com.marko.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Department dep = new Department("Sales", 300, 1500);
//            Employee emp1 = new Employee("Bob", "Bim", 500);
//            Employee emp2 = new Employee("Jim", "Back", 1200);
//            Employee emp3 = new Employee("Rob", "Front", 800);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);

            session.beginTransaction();
            System.out.println("Get dep");
            Department dep = session.get(Department.class, 4);

            System.out.println("Show dep");
            System.out.println(dep);

            System.out.println("Show emps");
            System.out.println(dep.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }

        finally {
            session.close();
            factory.close();
        }



    }
}
