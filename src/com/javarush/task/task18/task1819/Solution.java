package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        List<String> firstFileContent = new ArrayList<>();
        List<String> secondFileContent = new ArrayList<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            while (reader1.ready()) {
                String str = reader1.readLine();
                firstFileContent.add(str);
            }

            while (reader2.ready()) {
                String str = reader2.readLine();
                secondFileContent.add(str);
            }
            secondFileContent.addAll(firstFileContent);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
                for (String string : secondFileContent) {
                    writer.write(string);
                }
            }
        }
    }
}

