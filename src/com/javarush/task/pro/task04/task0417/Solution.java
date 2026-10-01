package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        int speedWind = scanner.nextInt();
        int ms = (int) Math.round(3.6 * speedWind);
        System.out.println(ms);
          //напишите тут ваш код

    }
}