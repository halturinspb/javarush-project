package com.javarush.task.pro.task15.task1506;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        List<String> str = null;

        try (Scanner scanner = new Scanner(System.in)) {
            str = Files.readAllLines(Path.of(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("UPPSS!!!!! " + e);
        }
        if (str != null) {
            formatList(str);
        }
    }

    public static void formatList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s.replaceAll("[ .,]", ""));
        }
    }
}

