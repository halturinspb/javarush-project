package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(scanner.readLine())) {
            StringBuilder builder = new StringBuilder();

            while (reader.ready()) {
                int ch = reader.read();
                builder.append((char) ch);
            }

            String[] split = builder.toString().split("\\W");
            int count = 0;
            for (String string : split) {
                if (string.equals("world")) count++;
            }
            System.out.println(count);
        }
    }
}
