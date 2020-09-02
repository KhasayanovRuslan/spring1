package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Product> products = session.createQuery("select p from Product p where p.name = 'product1'").getResultList();
            System.out.println(products);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Client> clients = session.createQuery("from Client c where c.name = 'Ivan'").getResultList();
            System.out.println(clients);
            session.getTransaction().commit();

//            DELETE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product1 = session.get(Product.class, 1);
//            session.delete(product1);
//            session.getTransaction().commit();
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Client client = session.get(Client.class, 1);
//            session.delete(client);
//            session.getTransaction().commit();
        }
        finally {
            factory.close();
            session.close();
        }


    }
}
