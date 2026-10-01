package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            Pattern pattern = Pattern.compile("\\b\\d+");

            while (reader.ready()) {
                String[] line = reader.readLine().split("\\s+");

                for (int i = 0; i < line.length; i++) {
                    Matcher matcher = pattern.matcher(line[i]);
                    if (matcher.find()) {
                        String num = matcher.group();
                        line[i] = matcher.replaceAll(map.getOrDefault(Integer.parseInt(num), num));
                    }
                }

                String result = String.join(" ", line);
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            while (reader.ready()) {
                String str = reader.readLine();
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    str = str.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(str);
            }
        }
    }
}




