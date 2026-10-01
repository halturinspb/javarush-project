package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] strings = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                strings = reader.readLine().split(" ");
            }
        }
        StringBuilder result = getLine(strings);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) return new StringBuilder();

        List<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);
            int count = 0;
            while (!list.isEmpty()) {
                String firstStart = builder.substring(0, 1);
                String firstEnd = builder.substring(builder.length() - 1);

                String secondStart = list.get(0).substring(0, 1);
                String secondEnd = list.get(0).substring(list.get(0).length() - 1);

                if (firstEnd.equalsIgnoreCase(secondStart)) {
                    builder.append(" ").append(list.get(0));
                } else if (firstStart.equalsIgnoreCase(secondEnd)) {
                    builder.insert(0, list.get(0) + " ");
                } else {
                    String string = list.get(0);
                    list.add(string);
                    count++;
                    if (count > Math.pow(words.length, 2)) {
                        break;
                    }
                }
                list.remove(0);
            }
            builderList.add(builder);
        }
        return Collections.max(builderList, Comparator.comparingInt(StringBuilder::length));
    }
}
