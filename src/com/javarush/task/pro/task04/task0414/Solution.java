package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        String line = scanner.next();
        int i = scanner.nextInt();
        int count = 0;
        do{
            System.out.println(line);
            count++;
        }
        while ((i > 0) && (i < 5) && (count<i));
    }
}