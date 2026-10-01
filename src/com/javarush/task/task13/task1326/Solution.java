package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in);
             BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(scanner.nextLine())))) {

            ArrayList<Integer> list = new ArrayList<>();

            while (br.ready()) {
              list.add(Integer.valueOf(br.readLine()));
            }

            list.stream().filter(integer -> integer % 2 == 0).sorted().forEach(System.out::println);
        }
    }
}
