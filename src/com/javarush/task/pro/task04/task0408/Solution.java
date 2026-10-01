package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int maxEVEN = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int x = scanner.nextInt();
            if (((x % 2) == 0) && (x > maxEVEN)) maxEVEN = x;
        }//напишите тут ваш код
        System.out.println(maxEVEN);
    }
}