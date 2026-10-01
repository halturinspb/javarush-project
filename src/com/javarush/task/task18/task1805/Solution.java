package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(bufferedReader.readLine())) {
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
        }
        list.stream().sorted().distinct().forEach(num ->System.out.print(num + " "));
    }
}
