package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        String line1 = scanner.next();
        String line2 = scanner.next();
        if (line1.equals(line2))
        System.out.println("строки одинаковые");
       else //напишите тут ваш код
        System.out.println("строки разные");
    }
}
