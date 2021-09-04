package com.marko.spring.hibernate_test;

import com.marko.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//
//        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Nickel", "Back", "Cleaner", 200);
//
//            session.beginTransaction();
//            session.save(employee);
//            int myId = employee.getId();
//            Employee employee1 = session.get(Employee.class, myId);
//            session.getTransaction().commit();
//            System.out.println(employee1);
//
//            System.out.println("Done!!!");
//
//
//        }
//        finally {
//            factory.close();
//        }
//    }
}
