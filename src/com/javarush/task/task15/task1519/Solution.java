package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("exit")) {
                break;
            }
            try {
                double doubleValue = Double.parseDouble(value);
                try {
                    long longValue = Long.parseLong(value);
                    if (longValue > 0 && longValue < 128) {
                        print(Short.parseShort(value));
                    } else{
                        print(Integer.parseInt(value));
                    }
                } catch (Exception e) {
                    print(doubleValue);
                }

            } catch (Exception e){
                print(value);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
