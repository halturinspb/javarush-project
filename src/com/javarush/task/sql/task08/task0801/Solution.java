package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();

        int rowsCount1 = statement.executeUpdate("UPDATE  employee SET salary = salary+2000 where name = 'Diego'");
        int rowsCount2 = statement.executeUpdate("UPDATE  employee SET salary = salary+500 where name = 'Amigo'");
        connection.commit();
        connection.close();

    }
}
