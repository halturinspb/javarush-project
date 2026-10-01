package com.javarush.task.pro.task15.task1515;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = null;

        try {
            path = Path.of(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (path != null) {
            if (path.isAbsolute()) System.out.println(path);
            else {
                System.out.println(path.toAbsolutePath());
            }
        }
//        System.out.println("КОНЕЦ!!!!");
//        System.out.println(Files.exists(path));
    }
}

