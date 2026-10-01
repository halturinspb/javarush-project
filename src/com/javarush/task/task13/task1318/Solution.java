package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in);
             FileInputStream fileInputStream = new FileInputStream(sc.nextLine());
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}