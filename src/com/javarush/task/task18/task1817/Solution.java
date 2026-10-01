package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int symbolNumber = 0;
        int spaceNumber = 0;
        try (InputStreamReader inputStreamReader = new FileReader(args[0])) {
            while (inputStreamReader.ready()) {
                int read = inputStreamReader.read();
                if (Character.isSpaceChar(read)) spaceNumber++;
                symbolNumber++;
            }
            double result = ((double) spaceNumber / (double) symbolNumber) * 100.0;
            System.out.printf("%.2f", result);
        }
    }
}
