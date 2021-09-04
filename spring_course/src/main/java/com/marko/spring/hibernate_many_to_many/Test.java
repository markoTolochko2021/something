package com.marko.spring.hibernate_many_to_many;

import com.marko.spring.hibernate_many_to_many.entity.Child;
import com.marko.spring.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 2);
            session.delete(section);


            session.getTransaction().commit();
            System.out.println("Done!!!!");
        }
        finally {
            session.close();
            factory.close();
        }


    }
}
