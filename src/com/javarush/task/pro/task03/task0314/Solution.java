package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        String pass = scanner.next();//напишите тут ваш код
        if(pass.equalsIgnoreCase(secret))  System.out.println("доступ разрешен");
        else System.out.println("доступ запрещен");//напишите тут ваш код

    }
}
