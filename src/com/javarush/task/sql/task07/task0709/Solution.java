package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select name, weight, birthday, inn  from employee");
        while (results.next()) {
            String name = results.getString("name");
            System.out.print(name + " ");

            Double weight = results.getDouble("weight");
            System.out.print(results.wasNull() ? "null" : weight + " ");

            Date birthday = results.getDate("birthday");
            System.out.print(birthday == null ? "null" : birthday);

            Long inn = results.getLong("inn");
            System.out.print(results.wasNull() ? "null" : inn + " ");
            System.out.println();
        }
        statement.close();
        connection.close();
    }
}
