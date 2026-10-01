package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        int coke = scanner.nextInt();
        int people = scanner.nextInt();

        double result = coke * 1.0 / people;

        System.out.println(result);//напишите тут ваш код

    }
}