package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select name,weight from employee");
        while (results.next()) {
            String name = results.getString("name");
            Double weight = results.getDouble("weight");
            if (results.wasNull()) {
                weight = null;
            }
            System.out.println(name + " " + weight);
        }
        statement.close();
        connection.close();
    }
}
