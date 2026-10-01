package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String path = console.readLine();

        if (args.length != 0 && args[0].equals("-c")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
                int maxId = 0;
                while (bufferedReader.ready()) {
                    String str = bufferedReader.readLine();
                    int id = Integer.parseInt(str.substring(0, 8).trim());
                    if (id > maxId) {
                        maxId = id;
                    }
                }
//                String setId = checkLength(String.valueOf(++maxId), 8);
//                String productName = checkLength(args[1], 30);
//                String price = checkLength(args[2], 8);
//                String quantity = checkLength(args[3], 4);


                bufferedWriter.newLine();
//                bufferedWriter.write(setId + productName + price + quantity);

                String formatStr = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", ++maxId, args[1], args[2], args[3]);
                bufferedWriter.write(formatStr);
            }
        }
    }

    public static String checkLength(String str, int limit) {
        if (str.length() > limit) {
            return str.substring(0, limit);
        } else {
            //return str + " ".repeat(limit - str.length());
            StringBuilder builder = new StringBuilder(str);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
