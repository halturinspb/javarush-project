package com.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Получение даты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select name, created from employee");
        while (results.next()){
            String name = results.getString("name");
            LocalDateTime created = results.getObject("created ", LocalDateTime.class);
            System.out.print(name + " " + created + " ");
        }
        statement.close();
        connection.close();
    }
}
