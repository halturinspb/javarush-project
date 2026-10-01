package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String[] split = reader.readLine().split(" ");
                map.merge(split[0], Double.valueOf(split[1]),Double::sum);
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
