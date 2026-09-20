package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {

            ResultSet results = statement.executeQuery("select min(distinct age) from employee");
            while (results.next()) {
                int value = results.getInt(1);
                System.out.println(" минимальное значение колонки age таблицы employee = " + value);
            }
        }
    }
}
