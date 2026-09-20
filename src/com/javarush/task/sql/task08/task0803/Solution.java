package com.javarush.task.sql.task08.task0803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
task0803
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        String name = "Harry";
        int age = 18;
        String smth = "Senior pomidor";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, smth);

        stmt.executeUpdate();
        connection.close();

    }
}
