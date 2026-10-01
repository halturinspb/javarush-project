package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            while (reader.ready()) {
                String[] splitLine = reader.readLine().split(" ");
                for (String numberInStr : splitLine)
                    writer.write(Math.round(Double.parseDouble(numberInStr)) + " ");
            }
        }
    }
}
