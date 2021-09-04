package com.marko.spring.hibernamet_one_to_one_uni;

import com.marko.spring.hibernamet_one_to_one_uni.entity.Department;
import com.marko.spring.hibernamet_one_to_one_uni.entity.Employee;
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
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department dep = session.get(Department.class, 3);
            session.delete(dep);

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally {
            session.close();
            factory.close();
        }


    }
}
