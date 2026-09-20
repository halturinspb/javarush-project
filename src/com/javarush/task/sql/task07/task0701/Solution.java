package com.javarush.task.sql.task07.task0701;

import java.sql.*;

/* 
task0701
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, userName, password);
        connection.close();

    }
}
