package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
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

            String string = builder.toString().replaceAll("\\.", "!");

            writer.write(string);
        }
    }
}
