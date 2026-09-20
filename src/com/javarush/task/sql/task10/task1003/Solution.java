package com.javarush.task.sql.task10.task1003;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Objects;

/* 
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {

        Transaction transaction = null;
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.createQuery("update Employee set smth = concat('senior', smth )").executeUpdate();
            transaction.commit();
        } catch (HibernateException ex) {
            if (Objects.nonNull(transaction)) {
                transaction.rollback();
            }
            throw new RuntimeException(ex);
        }

    }
}