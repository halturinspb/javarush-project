package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min) {
                min2 = min;
                min = x;
            }
            if ((x > min) && (x < min2)) min2 = x;
        }//напишите тут ваш код
        System.out.println(min2);//напишите тут ваш код
//напишите тут ваш код

    }
}