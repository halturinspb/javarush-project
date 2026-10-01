package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();

        while (true) {
            String path = scanner.nextLine();
            if (path.equals("end")) break;
            int index = path.lastIndexOf("t");
            int number = Integer.parseInt(path.substring(index + 1));
            map.put(number, path);
        }
        Collection<String> paths = map.values();

        for (String path : paths) {
            String basePath = path.substring(0, path.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));
                 BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(basePath, true))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }
        }
    }
}
