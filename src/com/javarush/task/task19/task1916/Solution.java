package com.javarush.task.task19.task1916;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFile1 = new BufferedReader(new FileReader(console.readLine()));
             BufferedReader readerFile2 = new BufferedReader(new FileReader(console.readLine()))) {

            while (readerFile1.ready()) {
                list1.add(readerFile1.readLine());
            }
            while (readerFile2.ready()) {
                list2.add(readerFile2.readLine());
            }
        }
        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list2.size() > 1 && list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            } else if (list1.size() > 1 && list1.get(1).equals(list2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
            }
        }
        if (!list1.isEmpty()) {
            lines.add(new LineItem(Type.REMOVED, list1.get(0)));
        }
        if (!list2.isEmpty()) {
            lines.add(new LineItem(Type.ADDED, list2.get(0)));
        }
        lines.forEach(System.out::println);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
