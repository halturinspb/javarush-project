package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(scanner.readLine());
             FileWriter writer = new FileWriter(scanner.readLine())) {

            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                int ch = reader.read();
                builder.append((char) ch);
            }
            for (int i = 1; i <= builder.length(); i++) {
                if (i % 2 == 0) writer.write(builder.charAt(i - 1));
            }
        }

    }
}
