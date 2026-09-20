package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            String hql = "select distinct smth from Employee where age > 18 order by smth";
            List<String> results = session.createQuery(hql, String.class).getResultList();
            results.forEach(System.out::println);
        }
    }
}
