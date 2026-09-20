package com.javarush.task.sql.task10.task1009;

import com.javarush.task.sql.task10.task1007.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/* 
task1009
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Average age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            String hql = "select sum(salary) from Employee";
            return session.createQuery(hql, Long.class).getSingleResult();
        }
    }

    public static Double getAverageAge() {
        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            String hql = "select avg(age) from Employee";
            return session.createQuery(hql, Double.class).getSingleResult();
        }
    }
}