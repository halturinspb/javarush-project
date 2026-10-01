package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        if (url.contains("?")) {
            String[] splitUrl1 = url.split("\\?");
            String[] splitUrl2 = splitUrl1[1].split("\\&");

            for (String s : splitUrl2) {
                String name = s.split("=")[0];
                System.out.print(name + " ");
            }
            System.out.println();

            for (String s : splitUrl2) {
                if (s.contains("obj")) {
                    try {
                        double value = Double.parseDouble(s.split("=")[1]);
                        alert(value);
                    } catch (Exception e) {
                        alert(s.split("=")[1]);
                    }
                }
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
