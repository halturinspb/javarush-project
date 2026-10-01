package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            Map<Integer, String> map = new HashMap<>();

            while (reader.ready()) {
                String line = reader.readLine();
                map.put(Integer.valueOf(line.substring(0, line.indexOf(" "))), line);
            }
            System.out.println(map.get(Integer.parseInt(args[0])));
        }
    }
}
