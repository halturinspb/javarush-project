package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String pathFile1 = args[0];
        String pathFile2 = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile2))) {
            List<String> list = new ArrayList<>();
            while (reader.ready()) {
                String[] split = reader.readLine().split(" ");
                for (String string : split) {
                    if (string.length() > 6) list.add(string);
                }
            }
            String join = String.join(",", list);
            writer.write(join);
        }
    }
}
