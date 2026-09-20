package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
task0804
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, userName, password);
        PreparedStatement stmt = connection.prepareStatement(sql);

        for (int i = 0; i < 5; i++) {
            stmt.setString(1, "employee_" + i);
            stmt.setInt(2, 30 + i);
            stmt.setString(3, "i=" + i);
            stmt.addBatch();
        }
        stmt.executeBatch();

        connection.close();
    }
}
