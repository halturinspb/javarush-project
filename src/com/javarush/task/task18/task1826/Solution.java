package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args[0].equals("-e")) {
            processingFile(args[1], args[2], true);
        }

        if (args[0].equals("-d")) {
            processingFile(args[1], args[2], false);
        }
    }

    public static void processingFile(String fileName, String fileOutputName, boolean tag) throws IOException {
        int index = tag ? 1 : -1;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutputName))) {

            while (reader.ready()) {
                String line = reader.readLine();
                StringBuilder sb = new StringBuilder();
                for (char symbol : line.toCharArray()) {
                    symbol = (char) (symbol + index);
                    sb.append(symbol);
                }
                writer.write(sb.toString());
                writer.newLine();
            }
        }
    }
}
