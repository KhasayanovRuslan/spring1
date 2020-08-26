package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Faculty.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Faculty faculty = session.get(Faculty.class, 1);
            System.out.println(faculty);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            faculty  = session.get(Faculty.class, 3);
            System.out.println(faculty);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
            session.close();
        }

    }
}
