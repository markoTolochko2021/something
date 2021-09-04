package com.marko.spring.hibernate_test;

import com.marko.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1200);
            session.createQuery("update Employee set salary = 1500 where name = 'Jack'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!!!");

        }
        finally {
            factory.close();
        }

    }
}
