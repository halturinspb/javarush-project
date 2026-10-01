package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try(BufferedReader bf = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while (bf.ready()) {
                String line = bf.readLine();
                lines.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
