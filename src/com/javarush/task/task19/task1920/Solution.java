package com.javarush.task.task19.task1920;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] split = reader.readLine().split(" ");
                String key = split[0];
                Double value = Double.parseDouble(split[1]);
                map.merge(key, value, Double::sum);

            }
            //System.out.println(map);
        }
        Double max = Collections.max(map.values());

        map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(max))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

//    public static void main1(String[] args) throws IOException {
//        Map<String, Double> map = Files.lines(Path.of(args[0]))
//                .map(line -> line.split(" "))
//                .collect(Collectors.groupingBy(array -> array[0],
//                        Collectors.summingDouble(array -> Double.parseDouble(array[1]))));
//
//        double max = map.values().stream()
//                .max(Double::compareTo)
//                .get();
//
//        map.entrySet().stream()
//                .filter(entry -> entry.getValue().equals(max))
//                .map(Map.Entry::getKey)
//                .sorted()
//                .forEach(System.out::println);
//    }
}

