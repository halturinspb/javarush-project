package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(bufferedReader.readLine())) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read) + 1);
                }
            }
        }
        Integer min = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(min)) {
                System.out.print(entry.getKey() + " ");
            }

        }
    }
}
