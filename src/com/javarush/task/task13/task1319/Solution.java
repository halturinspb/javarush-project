package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String pathFile = bufferedReader.readLine();

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    if ("exit".equals(line)) {
                        break;
                    }
                }
            }
        }
    }
}
