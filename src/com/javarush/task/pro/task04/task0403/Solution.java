package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        boolean isExit = false;
        int sum = 0;
        while (!isExit){
            String line = scanner.nextLine();
            isExit = line.equalsIgnoreCase("ENTER");
            if(isExit) break;
            int i = Integer.parseInt(line);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}