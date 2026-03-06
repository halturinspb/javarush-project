package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
        int result;
        if (a <= b && a <= c) result = a;
        else if (b <= a && b <= c) result = b;
        else if (c <= a && c <= b) result = c;
        else result = 0;

       return result; //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
