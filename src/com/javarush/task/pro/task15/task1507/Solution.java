package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> str = null;

        try (Scanner scanner = new Scanner(System.in)) {
            str = Files.readAllLines(Path.of(scanner.nextLine()));
        }
        catch (Exception e) {
            System.out.println("UPPSS!!!!! " + e);
        }
        for (int i = 0; i < str.size(); i+=2) {
            System.out.println(str.get(i));
        }
    }
}

