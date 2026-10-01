package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(scanner.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(scanner.readLine()))) {

            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                builder.append(reader.readLine());
            }

            String string = builder.toString().replaceAll("\\p{P}", "");
            writer.write(string);
        }
    }
}
