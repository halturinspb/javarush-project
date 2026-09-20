package com.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
task0704
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select * from employee");
        while (results.next()) {
            String name = results.getString("name");
            System.out.println(name);
        }
        statement.close();
        connection.close();

    }
}
