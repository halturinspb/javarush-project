package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            if (x < min) min= x;
        }//напишите тут ваш код
        System.out.println(min);//напишите тут ваш код

    }
}