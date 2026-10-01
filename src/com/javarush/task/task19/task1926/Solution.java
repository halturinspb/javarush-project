package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            while (reader.ready()) {
            list.add(reader.readLine());
            }

            for (String string : list) {
                System.out.println(new StringBuilder(string).reverse());
            }
        }


    }
}
