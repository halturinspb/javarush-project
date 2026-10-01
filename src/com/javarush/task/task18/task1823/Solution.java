package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String path = scanner.nextLine();
            if (path.equals("exit")) return;
            new ReadThread(path);
        }
    }

    public static class ReadThread extends Thread {
        private String path;

        public ReadThread(String fileName) {
            this.path = fileName;
            this.start();
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> map = new HashMap<>();
            try (FileInputStream reader = new FileInputStream(path)) {
                while (reader.available() > 0) {
                    int read = reader.read();
                    map.merge(read, 1, Integer::sum);
                }
                Integer max = Collections.max(map.values());
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(max)) {
                        resultMap.put(path, entry.getKey());
                    }
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
