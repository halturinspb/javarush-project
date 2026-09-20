package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("select * from employee limit 1");
            ResultSetMetaData resultSetMetaData = results.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                String columnName = resultSetMetaData.getColumnName(column);
                String columnType = resultSetMetaData.getColumnTypeName(column);
                System.out.printf("%s(%s)", columnName, columnType);
            }
        }
    }
}
